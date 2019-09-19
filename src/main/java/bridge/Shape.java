package bridge;

/**
 * Abstraction
 */
public abstract class Shape {
    protected  DrawingAPI drawingAPI;

    public Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();

    public abstract void resizeByPercentage(double percentage);

}
