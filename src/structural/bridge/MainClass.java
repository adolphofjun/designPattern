package structural.bridge;

/**
 * 意图：将抽象部分与实现部分分离，使它们都可以独立的变化。
 * 主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
 * 何时使用：实现系统可能有多个角度分类，每一种角度都可能变化。
 * 如何解决：把这种多角度分类分离出来，让它们独立变化，减少它们之间耦合。
 * 关键代码：抽象类依赖实现类。
 */
public class MainClass {
    public static void main(String[] args) {
        Eat eat = new EatImpl();
        ManOne manOne = new ManOne(eat);
        manOne.activity();
    }
}