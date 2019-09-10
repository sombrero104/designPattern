package decorator;

public abstract class Beverage {

    String description = "Empty";

    public String getDescription() {
        return description;
    }

    public abstract int cost();

}
