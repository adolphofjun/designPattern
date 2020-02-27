package structural.bridge;



public class ManOne extends AbsMan {

    public ManOne(Eat eat) {
        super(eat);
    }

    @Override
    void activity() {
        eat.eatFood();
    }
}
