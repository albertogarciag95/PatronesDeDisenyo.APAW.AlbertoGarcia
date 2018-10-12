package test;

import main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
