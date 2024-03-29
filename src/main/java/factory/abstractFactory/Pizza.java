package factory.abstractFactory;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

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

    public void setName(String name) {
        this.name = name;
    }

}
