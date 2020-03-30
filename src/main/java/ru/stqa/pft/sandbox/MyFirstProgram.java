package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь Прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        double x1 = 1, y1 = 2, x2 = 3, y2 = 4;
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.println(Point.distance(p1, p2));
    }
}
