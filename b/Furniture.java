package furniture;

abstract public class Furniture {

    public enum Material {
        METAL, WOOD, PLASTIC, GLASS
    };


    protected Material material;
    protected int length;
    protected int width;
    protected int height;
    protected String name;

    public Furniture(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    static public Object[] getMaterialList() {
        Material[] materials = Material.values();
        return materials;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setMaterial(Object material) {
        this.material = (Material)material;
    }

    @Override
    public String toString() {
        return name;
    }

    public Object getMaterial() {
        return material;
    }

    abstract public Object[] getTypesList();
    abstract public void setType(Object type);
    abstract public Object getType();
}
