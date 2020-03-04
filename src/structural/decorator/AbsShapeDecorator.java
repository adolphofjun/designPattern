package structural.decorator;

/**
 * 装饰器抽象类
 */
public abstract class AbsShapeDecorator implements Shape {
    protected Shape shape;
    //构造器是为了动态设置Shape的实现类
    public AbsShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    /**
     * 扩展的新方法
     */
    public abstract void setColor();
}
