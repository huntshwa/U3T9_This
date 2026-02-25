public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        // implement me as described in part (a)
    }

    // creates a cube: a box with all dimensions equal to side
    public Box(double side) {
        // implement me as described in part (b)
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        // implement me as described in part (c)
    }

    public Box greaterVolume(Box otherBox) {
        // implement me as described in part (d)
    }

    public String boxInfo() {
        // implement me as described in part (e)
    }

    public void addToShape(Shape s) {
        // implement me as described in part (f)
    }

}
