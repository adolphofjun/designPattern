package creationalpatterns.prototype;

public abstract class Shape implements Cloneable {

    private String id;
    private String name;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clone;
    }
}
