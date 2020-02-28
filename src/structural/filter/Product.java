package structural.filter;

public class Product {

    private String name;
    private String spec;
    private int width;
    private int length;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", spec='" + spec + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
