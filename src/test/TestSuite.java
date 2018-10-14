package test;

import main.*;
import main.estrategia.*;
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
        factory.addBanda(new Banda("1", "Union Musical Ciudad de Asis"));
        factory.addBanda(new Banda("2", "Union Musical Villafranqueza"));

        assertEquals("Union Musical Ciudad de Asis",factory.getBanda("1").getBandaName());
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

        // Dos objetos hoja
        PartituraLeaf partituraLeaf = new PartituraLeaf(partitura);
        PartituraLeaf partituraLeaf2 = new PartituraLeaf(partitura2);

        //Un objeto composite que anyade los dos objetos hoja
        PartituraComposite partituraComposite = new PartituraComposite("Beethoven sinfonies");
        partituraComposite.add(partituraLeaf);
        partituraComposite.add(partituraLeaf2);

        assertTrue(partituraComposite.isComposite());
        assertFalse(partituraLeaf.isComposite());

        //Devuelve id de partitura si es hoja; nombre si es composite
        assertEquals("Beethoven sinfonies", partituraComposite.view());
        assertEquals("1", partituraLeaf.view());
    }

    @Test
    public void testObserver() {
        new Musico(factory); //Musico implementa Observer
        new Musico(factory);

        factory.addBanda(new Banda("3", "Banda de Villena"));
        //se notifica a los dos musicos, el id del objeto anyadido

        assertEquals("Banda de Villena",factory.getBanda("3").getBandaName());
    }
}
