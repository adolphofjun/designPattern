package structural.bridge;

/**
 * 抽象出来的人
 */
public abstract class AbsMan {
    Eat eat;

    public AbsMan(Eat eat){
        this.eat = eat;
    }
    abstract void activity () ;
}
