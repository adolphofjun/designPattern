package creationalpatterns.factory.factory;

import creationalpatterns.factory.entity.*;

public class ColorFactory extends AbsFactory {

    public Color getColor(String color) {
        if("RED".equals(color)){
            return new Red();
        }
        if("BLUE".equals(color)){
            return new Blue();
        }
        return null;
    }

    public Shape getShape(String shape){

        return null;
    }
}
