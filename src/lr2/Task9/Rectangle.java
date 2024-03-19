package lr2.Task9;
public class Rectangle extends Shape {
    private double length;
    private double width;
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    public void setLength(double l) {
        length = l;
    }
    public void setWidth(double w) {
        width = w;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    @Override
    public double Area() {
        return length * width;
    }
    @Override
    public double Perimeter() {
        return 2 * (length + width);
    }
}