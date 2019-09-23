package visitor;

/**
 * Client
 */
public class VisitorTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }

}
