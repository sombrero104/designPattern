package builder.builder1;

/**
 * Product
 */
public class Car {
    int wheel;
    String color;

    public Car(int wheel, String color) {
        this.wheel = wheel;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                ", color='" + color + '\'' +
                '}';
    }

}
