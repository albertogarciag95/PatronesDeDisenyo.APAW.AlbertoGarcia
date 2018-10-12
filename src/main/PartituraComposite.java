package main;

import java.util.ArrayList;
import java.util.List;

public class PartituraComposite extends PartituraComponent {

    private List<PartituraComponent> partituraComponentList;

    public PartituraComposite(String nombre) {
        super(nombre);
        partituraComponentList = new ArrayList<>();
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public void add(PartituraComponent partituraComponent) {
        assert partituraComponent != null;
        partituraComponentList.add(partituraComponent);
    }

    @Override
    public void remove(PartituraComponent partituraComponent) {
        assert partituraComponent != null;
        partituraComponentList.remove(partituraComponent);
    }

    @Override
    public String view() {
        return this.getNombre();
    }
}
