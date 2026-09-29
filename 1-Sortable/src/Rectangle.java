public class Rectangle implements Sortable {
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
    public boolean isBigger(Sortable other) {
        Rectangle rectangle = (Rectangle) other;

        return area() > rectangle.area();
    }

}
