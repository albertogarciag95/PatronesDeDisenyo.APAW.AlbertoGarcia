package main;

import java.time.LocalDateTime;

public class Banda {
    private String id;
    private String nombre;
    private String direccion;
    private String email;
    private LocalDateTime fechaFundacion;
    private Musico[] musicos;

    public Banda(String id) {
        this.id = id;
    }

    public Banda(String id, String name) {
        this.id = id;
        this.nombre = name;
    }

    public String getBandaName() {
        return nombre;
    }

    public String getId() {
        return id;
    }

}
