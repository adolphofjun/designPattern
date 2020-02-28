package structural.composite;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.List;

/**
 * 组合模式
 * 将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 * 它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以像处理简单元素一样来处理复杂元素，从而使得客户程序与复杂元素的内部结构解耦。
 */
public class Department {
    private String name;
    List<Department> children;//子部分

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
