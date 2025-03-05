public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        
        shapes[0] = new Circle(5.0);            // Circle with radius 5.0
        shapes[1] = new Rectangle(4.0, 6.0);   // Rectangle with length 4.0 and width 6.0
        shapes[2] = new Sphere(3.0);           // Sphere with radius 3.0
        shapes[3] = new Cube(2.0);             // Cube with side length 2.0

        for (Shape shape : shapes) {
            System.out.println(shape.getDescription());
            
            if (shape instanceof TwoDimensionalShape) {
                TwoDimensionalShape twoDShape = (TwoDimensionalShape) shape;
                System.out.println("Area: " + twoDShape.getArea());
            }
            
            if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
                System.out.println("Surface Area: " + threeDShape.getArea());
                System.out.println("Volume: " + threeDShape.getVolume());
            }
            
            System.out.println();  
        }
    }
}