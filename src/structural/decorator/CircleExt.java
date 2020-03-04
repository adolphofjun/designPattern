package structural.decorator;

/**
 * 装饰器实现类，使用装饰器实现类实现Shape的扩展
 */
public class CircleExt extends AbsShapeDecorator {

    public CircleExt(Shape shape) {
        super(shape);
    }

    @Override
    public void setColor() {
        System.out.println("===setColor");
    }

    @Override
    public void draw() {
        super.shape.draw();
        setColor();
    }
}
