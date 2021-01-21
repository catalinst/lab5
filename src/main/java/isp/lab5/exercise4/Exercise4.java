package isp.lab5.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        AbstractShapeFactory roundedShapeFactory = ShapeFactoryProvider.getShapeFactory("rounded");
        AbstractShapeFactory normalShapeFactory = ShapeFactoryProvider.getShapeFactory("normal");

        // create instances
        Shape rectangle = roundedShapeFactory.getShape("roundedRectangle");
        Shape shape = normalShapeFactory.getShape("rectangle");

        Shape square = normalShapeFactory.getShape("square");
        Shape roundedSquare = roundedShapeFactory.getShape("roundedSquare");

        rectangle.draw();
        shape.draw();

        square.draw();
        roundedSquare.draw();
    }
}
