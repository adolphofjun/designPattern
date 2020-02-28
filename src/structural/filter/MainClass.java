package structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式
 * 使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。
 * 这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
 */
public class MainClass {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(getProduct("产品","规格",5,5));
        products.add(getProduct("产品","规格",4,15));
        products.add(getProduct("产品","规格",10,10));
        products.add(getProduct("产品","规格",15,3));

        WidthFilterImpl widthFilter = new WidthFilterImpl();
        LengthFilterImpl lengthFilter =  new LengthFilterImpl();
        System.out.println("widthFilter=====");
        List<Product> temps = widthFilter.filterProduct(products);
        for(Product product : temps){
            System.out.println(product.toString());
        }
        temps = lengthFilter.filterProduct(temps);
        System.out.println("lengthFilter=====");
        for(Product product : temps){
            System.out.println(product.toString());
        }


    }

    private static Product getProduct(String name,String spec,int width,int length){
        Product product = new Product();
        product.setSpec(spec);
        product.setName(name);
        product.setWidth(width);
        product.setLength(length);


        return product;
    }




}
