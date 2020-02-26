package structural.adapter;

public class MainClass {

    public static void main(String[] args) {
        new OldPlayerImpl().play("map3");
        new OldPlayerImpl().play("map4");
        new OldPlayerImpl().play("vlc");
    }
}
