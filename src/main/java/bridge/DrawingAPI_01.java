package bridge;

public class DrawingAPI_01 implements DrawingAPI {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API_01 circle at %f:%f, radius %f\n", x, y, radius);
    }

}
