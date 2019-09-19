package builder.builder1;

/**
 * Client
 */
public class CarTest {

    public static void main(String[] args) {
        Car car = new CarBuilder().setWheel(4).setColor("Black").getCar();
        System.out.println(car);
    }

}
