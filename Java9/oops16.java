import java.util.Scanner;

abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() {
        return a + b + c;
    }
}

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle(5, 3);
        Circle c = new Circle(4);
        Triangle t = new Triangle(3, 4, 5);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Rectangle Perimeter: " + r.perimeter());
        System.out.println("Circle Area: " + c.area());
        System.out.println("Circle Perimeter: " + c.perimeter());
        System.out.println("Triangle Area: " + t.area());
        System.out.println("Triangle Perimeter: " + t.perimeter());
    }
}