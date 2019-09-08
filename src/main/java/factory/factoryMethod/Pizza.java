package factory.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing: " + name);
        System.out.println("Tossing dough..");
        System.out.println("Adding source.");
        System.out.println("Adding toppings.");
        for(String topping : toppings) {
            System.out.println("\t- topping: " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350.");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slice.");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box.");
    }

    public String getName() {
        return this.name;
    }

}
