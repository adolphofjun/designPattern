package creationalpatterns.builder;

/**
 * 套餐
 */
public class Package {
    private Drink drink;
    private Hamburger hamburger;

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public void printName(){
        if(drink!=null)
        drink.printName();
        if(hamburger!=null)
        hamburger.printName();
    }
}
