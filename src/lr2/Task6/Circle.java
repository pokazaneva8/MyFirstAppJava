package lr2.Task6;

public class Circle implements Geomfigure {
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
    public static void main(String[] args) {
        Circle c = new Circle(20);
        c.setRadius(5);
        System.out.println("Радиус круга: " + c.getRadius());
        System.out.println("Площадь круга: " + c.Area());
        System.out.println("Периметр круга: " + c.Perimeter());
    }
}