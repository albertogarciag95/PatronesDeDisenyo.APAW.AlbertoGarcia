package test;

import main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSuite {

    public BandaFactory factory;

    @BeforeEach
    public void before() {
        factory = BandaFactory.getBandafactory();
    }

    @Test
    public void testBandaFactory() {
        factory.addBanda("1", new Banda("1", "Union Musical Ciudad de Asis"));
        factory.addBanda("2", new Banda("2", "Union Musical Villafranqueza"));

        assertEquals("Union Musical Ciudad de Asis",
                BandaFactory.getBandafactory().getBanda("1").getBandaName());
    }

    @Test
    public void testInstrumentoBuilder() {
        Instrumento instrumento = new InstrumentoBuilder().id("1").nombre("Trompeta")
                .material("Laton").familia(FamiliaInstrumento.VIENTO_METAL).build();

        assertEquals("Trompeta de Laton",
                instrumento.getNombre() + " de " + instrumento.getMaterial());
    }

    @Test
    public void testPartituraComposite() {
        Partitura partitura = new Partitura("1", "9º Sinfonia Beethoven");
        Partitura partitura2 = new Partitura("2", "8º Sinfonia Beethoven");

        PartituraLeaf partituraLeaf = new PartituraLeaf(partitura);
        PartituraLeaf partituraLeaf2 = new PartituraLeaf(partitura2);

        PartituraComposite partituraComposite = new PartituraComposite("Beethoven sinfonies");
        partituraComposite.add(partituraLeaf);
        partituraComposite.add(partituraLeaf2);

        assertTrue(partituraComposite.isComposite());
        assertFalse(partituraLeaf.isComposite());

        //Devuelve id de partitura si es hoja; nombre si es composite
        assertEquals("Beethoven sinfonies", partituraComposite.view());
        assertEquals("1", partituraLeaf.view());
    }
}
