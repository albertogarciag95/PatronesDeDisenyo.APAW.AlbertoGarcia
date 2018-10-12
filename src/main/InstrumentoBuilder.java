package main;

public class InstrumentoBuilder {
    private String id;
    private String nombre;
    private String material;
    private FamiliaInstrumento familia;

    public InstrumentoBuilder() {}

    public Instrumento build() {
        return new Instrumento(this);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMaterial() {
        return material;
    }

    public FamiliaInstrumento getFamilia() {
        return familia;
    }

    public InstrumentoBuilder id(String id) {
        this.id = id;
        return this;
    }

    public InstrumentoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public InstrumentoBuilder material(String material) {
        this.material = material;
        return this;
    }

    public InstrumentoBuilder familia(FamiliaInstrumento familia) {
        this.familia = familia;
        return this;
    }
}

