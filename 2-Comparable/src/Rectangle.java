public class Rectangle implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public double area() {
        return width * height;
    }

    @Override
    public int compareTo(Rectangle other) {
        if (area() > other.area()) {
            return 1;
        }

        if (area() < other.area()) {
            return -1;
        }

        return 0;
    }

}
