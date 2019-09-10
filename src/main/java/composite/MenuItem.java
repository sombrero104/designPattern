package composite;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.println("\t---------------------------------------");
        System.out.println("\t" + getName());
        if(isVegetarian()) System.out.println("\t" + "(Vegetarian)");
        System.out.println("\t" + getPrice());
        System.out.println("\t" + getDescription());
        System.out.println("\t---------------------------------------");
        System.out.println("-------------------------------------------");
    }

}
