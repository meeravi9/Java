package OCP;

public class Main {
    public static void main(String[] args) {
        DrawingManager drawingManager = new DrawingManager();

        // Creating instances of different shape classes
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        // Drawing different shapes
        drawingManager.drawShape(circle);
        drawingManager.drawShape(rectangle);
        drawingManager.drawShape(triangle);
        drawingManager.drawShape(square);
    }
}
