package main;

import java.util.HashMap;
import java.util.Map;

public class BandaFactory {

    public Map<String, Banda> bandas;
    private static BandaFactory bandafactory;

    private BandaFactory() {

    }

    public static BandaFactory getBandafactory() {
        if(bandafactory == null)
            bandafactory = new BandaFactory();

        return bandafactory;
    }

    public void addBanda(String id, Banda banda) {
        if(bandas == null) {
            bandas = new HashMap<>();
        }
        if(!bandas.containsKey(id)) {
            bandas.put(id, banda);
        }
    }

    public Banda getBanda(String id) {
        Banda bandaAux = null;
        if(bandas.containsKey(id)) {
            bandaAux = bandas.get(id);
        }
        return bandaAux;
    }
}
