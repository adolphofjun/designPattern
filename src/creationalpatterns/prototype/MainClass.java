package creationalpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 用原型实例指定创建对象的种类，并且通过拷贝（浅拷贝，内存地址相同）这些原型创建新的对象。
 * 利用已有的一个原型对象，快速地生成和原型对象一样的实例。
 */
public class MainClass {

    public static void main(String[] args) {
        Map<String,Shape> cache = new HashMap<>();
        Rectangle rectangle = new Rectangle();
        cache.put("rectangle",rectangle);
        Rectangle temp = (Rectangle) cache.get("rectangle").clone();
        temp.draw();
    }


}
