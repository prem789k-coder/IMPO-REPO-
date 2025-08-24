import java.io.*;
import java.util.*;

class Shape {
    void area() {
        System.out.println("Area of Shape");
    }

    void perimeter() {
        System.out.println("Perimeter of Shape");
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle=" + (length * breadth));
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle=" + (2 * (length + breadth)));
    }
}

class Circle extends Shape {
    int radius;

    Circle(int rd) {
        radius = rd;
    }

    void area() {
        System.out.println("Area of Circle=" + (Math.PI * Math.pow(radius, 2)));
    }

    void perimeter() {
        System.out.println("Perimeter of Circle=" + (2 * Math.PI * radius));
    }
}

class Calculate {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length and breadth");
        int ln = in.nextInt();
        int bd = in.nextInt();
        System.out.println("Enter radius");
        int rad = in.nextInt();

        Rectangle obj1 = new Rectangle(ln, bd);
        Circle obj2 = new Circle(rad);

        obj1.area();
        obj1.perimeter();
        obj2.area();
        obj2.perimeter();

        // Demonstrating Dynamic Method Dispatch
        Shape obj3 = new Rectangle(11, 12);
        obj3.area();
        obj3.perimeter();

        Shape obj4 = new Circle(7);
        obj4.area();
        obj4.perimeter();
    }
}
