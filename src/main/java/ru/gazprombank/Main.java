package ru.gazprombank;

public class Main {

    public static void main(String[] args) {
        hello("world");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(5, 7);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Point p = new Point(5, 6, 8, 10);
        System.out.println("Расстояние между точками = " + p.distance());
    }
    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}

