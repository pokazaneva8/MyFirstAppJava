package lr2.Task5;

public class Rectangle {
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
    public double Area() {
        return length * width;
    }
    public double Perimeter() {
        return 2 * (length + width);
    }
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.5, 8.5);
        System.out.println("Длина: " + rect1.getLength());
        System.out.println("Ширина: " + rect1.getWidth());
        System.out.println("Площадь: " + rect1.Area());
        System.out.println("Периметр: " + rect1.Perimeter());
        rect1.setLength(5);
        rect1.setWidth(5);
        System.out.println();
        System.out.println("Длина: " + rect1.getLength());
        System.out.println("Ширина: " + rect1.getWidth());
        System.out.println("Площадь: " + rect1.Area());
        System.out.println("Периметр: " + rect1.Perimeter());
    }
}