package bridge;

/**
 * Concrete Implementor
 */
public class DrawingAPI_02 implements DrawingAPI {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API_02 circle at %f:%f, radius %f\n", x, y, radius);
    }

}
