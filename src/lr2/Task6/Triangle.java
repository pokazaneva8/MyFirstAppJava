package lr2.Task6;

public class Triangle implements Geomfigure {
    private double a;
    private double b;
    private double c;
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    @Override
    public double Area() {
        double p = a + b + c;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    @Override
    public double Perimeter() {
        return a + b + c;
    }
    public static void main(String[] args) {
        Triangle t = new Triangle(0, 0, 0);
        t.setA(3);
        t.setB(4);
        t.setC(5);
        System.out.println("Сторона тругольника а: " + t.getA());
        System.out.println("Сторона тругольника b: " + t.getB());
        System.out.println("Сторона тругольника c: " + t.getC());
        System.out.println("Площадь тругольника: " + t.Area());
        System.out.println("Периметр треугольника: " + t.Perimeter());
    }
}