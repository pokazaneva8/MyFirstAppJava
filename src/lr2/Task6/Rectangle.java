package lr2.Task6;

public class Rectangle implements Geomfigure {
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
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 8);
        System.out.println("Длина: " + rect1.getLength());
        System.out.println("Ширина: " + rect1.getWidth());
        System.out.println("Площадь прямоугольника: " + rect1.Area());
        System.out.println("Периметр прямоугольника: " + rect1.Perimeter());
    }
}