package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь Прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }
}