package creationalpatterns.builder;

/**
 * 意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 * 何时使用：一些基本部件不会变，而其组合经常变化的时候。
 */
public class Director {

    private Package packageItem = new Package();



    public void bulidDrink(Drink drink){
        this.packageItem.setDrink(drink);

    }

    public void bulidHamburfer(Hamburger hamburger){
        this.packageItem.setHamburger(hamburger);
    }

    public Package getPackageItem() {
        return  this.packageItem;
    }


}
