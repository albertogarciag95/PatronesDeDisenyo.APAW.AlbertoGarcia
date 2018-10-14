package main;

public class Musico implements Observer{
    private String id;
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean esProfesional;
    private Instrumento instrumento;
    private BandaFactory factory;

    public Musico(BandaFactory factory) {
        this.factory = factory;
        this.factory.addObserver(this);
    }

    @Override
    public void update(String id) {
        System.out.println("Se ha añadido un objeto nuevo a la factory, con id: " + id);
    }
}
