package lr2.Task9;

public class Triangle extends Shape {
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
}