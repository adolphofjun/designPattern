package structural.facade;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ShapeMaker {

    private Shape rectangle;
    private Shape square;

    public  ShapeMaker () {
        this.rectangle = new Rectangle();
        this.square = new Square();
    }


    public void drawSquare(){
        square.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
}
