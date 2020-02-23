package creationalpatterns.factory.factory;

import creationalpatterns.factory.entity.Color;
import creationalpatterns.factory.entity.Shape;

/**
 * 抽象工产模式:工厂的工厂
 * 用于生产继承抽象工厂的工厂
 * 主要解决接口选择的问题。
 * 系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
 */
public abstract class AbsFactory {
    //所有相关联工厂的生产实例方法
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;

    public static AbsFactory getFactory(String name) {
        if("shape".equals(name)){
            return new ShapeFactory();
        }
        if("color".equals(name)){
            return new ColorFactory();
        }
        return null;
    }
}
