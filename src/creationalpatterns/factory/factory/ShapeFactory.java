package creationalpatterns.factory.factory;

import creationalpatterns.factory.entity.Rectangle;
import creationalpatterns.factory.entity.Shape;
import creationalpatterns.factory.entity.Square;

/**
 * 工厂模式：创建接口实现类的最佳方式，
 * 工产更具条件创建具体的实现类
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if("SQUARE".equals(shapeType)){
            return new Square();
        }
        if("Rectangle".equals(shapeType)){
            return new Rectangle();
        }
        return null;
    }
}
