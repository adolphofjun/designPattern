package creationalpatterns.singleton;

public class SingleObject {

    private static SingleObject object;
    //构造方法私有
    private SingleObject() {

    }

    public static SingleObject getSingleObj() {
        if(object == null) return new SingleObject();
        return object;
    }

    public void showMessage(){
        System.out.println("single");
    }
}
