package furniture;

public class Table extends Furniture {

    public enum Type {
        BEDSIDE, COFFEE, GATELEG, REFECTORY, DRAFTING, DINNING_ROOM, WORKBENCH
    }

    private Type type;

    public Table(int length, int width, int height) {
        super(length, width, height);
        super.name = "Table";
    }

    @Override
    public Object[] getTypesList() {
        Type[] types = Type.values();
        return types;
    }

    @Override
    public void setType(Object type) {
        this.type = (Type)type;
    }

    @Override
    public Object getType() {
        return type;
    }
}
