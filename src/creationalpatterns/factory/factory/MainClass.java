package creationalpatterns.factory.factory;

import creationalpatterns.factory.entity.Color;

import java.awt.*;

public class MainClass {

    public static void main(String[] args) {
        AbsFactory factory = AbsFactory.getFactory("color");
        Color color = factory.getColor("RED");
        color.faill();
    }
}
