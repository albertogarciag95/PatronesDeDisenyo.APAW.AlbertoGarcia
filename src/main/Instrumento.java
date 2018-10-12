package main;

public class Instrumento {
    private String id;
    private String nombre;
    private String material;
    private FamiliaInstrumento familia;

    public Instrumento() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getMaterial() {
        return material;
    }

    public Instrumento(InstrumentoBuilder builder) {
        this.id = builder.getId();
        this.nombre = builder.getNombre();
        this.material = builder.getMaterial();
        this.familia = builder.getFamilia();
    }
}
