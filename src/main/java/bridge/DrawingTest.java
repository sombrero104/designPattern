package bridge;

public class DrawingTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new CircleShape(1, 2, 3, new DrawingAPI_01());
        shapes[1] = new CircleShape(5, 7, 11, new DrawingAPI_02());

        System.out.println("----------------------------------------------------------");
        for(Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
        System.out.println("----------------------------------------------------------");
    }

}
