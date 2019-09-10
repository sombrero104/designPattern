package decorator;

public class CoffeeStore {

    public static void main(String[] args) {

        System.out.println("------------------------------------");
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " cost: " + espresso.cost());

        System.out.println("------------------------------------");
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " cost: " + darkRoast.cost());

        System.out.println("------------------------------------");
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " cost: " + houseBlend.cost());
        System.out.println("------------------------------------");

    }

}
