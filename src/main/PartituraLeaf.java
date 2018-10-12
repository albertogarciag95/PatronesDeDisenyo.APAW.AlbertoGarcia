package main;

public class PartituraLeaf extends PartituraComponent{

    private Partitura partitura;

    public PartituraLeaf(Partitura partitura) {
        super(partitura.getId());
        this.partitura = partitura;
    }

    @Override
    public void add(PartituraComponent partituraComponent) {
        //No se hace nada porque es una hoja
    }

    @Override
    public void remove(PartituraComponent partituraComponent) {
        //No se hace nada porque es una hoja
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public String view() {
        return partitura.getId();
    }
}
