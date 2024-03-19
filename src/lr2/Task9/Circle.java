package lr2.Task9;

public class Circle extends Shape {
    private double radius;
    Circle(double r) {
        this.radius = r;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }
    @Override
    public double Perimeter() {
        return 2 * Math.PI * radius;
    }
}
