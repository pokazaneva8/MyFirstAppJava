package lr2.Task9;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(20);
        c.setRadius(5);
        System.out.println("Радиус круга: " + c.getRadius());
        System.out.println("Площадь круга: " + c.Area());
        System.out.println("Периметр круга: " + c.Perimeter());
        System.out.println();
        Rectangle rect1 = new Rectangle(5, 8);
        System.out.println("Длина: " + rect1.getLength());
        System.out.println("Ширина: " + rect1.getWidth());
        System.out.println("Площадь прямоугольника: " + rect1.Area());
        System.out.println("Периметр прямоугольника: " + rect1.Perimeter());
        System.out.println();
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
