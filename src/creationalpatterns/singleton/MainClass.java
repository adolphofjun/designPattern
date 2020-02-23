package creationalpatterns.singleton;

public class MainClass {

    public static void main(String[] args) {
        SingleObject object = SingleObject.getSingleObj();
        object.showMessage();
    }
}
