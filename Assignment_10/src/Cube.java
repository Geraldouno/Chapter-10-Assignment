public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;  // Surface area 
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);  // Volume 
    }

    @Override
    public String getDescription() {
        return "This is a Cube with side length " + side;
    }
}