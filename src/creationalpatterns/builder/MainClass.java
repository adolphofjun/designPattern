package creationalpatterns.builder;

public class MainClass {

    public static void main(String[] args) {
        Director director = new Director();

        director.bulidDrink(new DrinkTwo());
       // director.bulidHamburfer(new HamburgerTwo());
        director.getPackageItem().printName();
        director.bulidDrink(new DrinkOne());
        //director.bulidHamburfer(new HamburgerOne());
        director.getPackageItem().printName();


    }
}
