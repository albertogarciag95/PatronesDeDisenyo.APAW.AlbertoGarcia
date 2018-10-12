package main;

public abstract class PartituraComponent {

    private String nombre;

    public PartituraComponent(String nombre) {
        this.nombre = nombre;
    }
    public abstract boolean isComposite();
    public abstract String view();
    public abstract void add(PartituraComponent partituraComponent);
    public abstract void remove(PartituraComponent partituraComponent);
    public String getNombre() {
        return nombre;
    }
}
