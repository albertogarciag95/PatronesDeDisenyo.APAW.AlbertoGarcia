package main;

public class Partitura {
    private String id;
    private String titulo;
    private String compas;

    public Partitura(String id, String titulo) {
        this.titulo = titulo;
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }
}
