import java.io.*;

class Area {
    int s, l, b;
    double r;

    Area(int sd) {
        s = sd;
        System.out.println("Area of Square is : " + (sd * sd));
    }

    Area(double r) {
        this.r = r;
        System.out.println("Area of Circle is : " + (3.14 * r * r));
    }

    Area(int l, int b) {
        this.l = l;
        this.b = b;
        System.out.println("Area of Rectangle is : " + (this.l * this.b));
    }

    public static void main(String args[]) {
        Area obj1 = new Area(5);
        Area obj2 = new Area(9.2);
        Area obj3 = new Area(6, 9);
        Area obj6 = new Area(8.8);
        Area obj4 = new Area(12, 11);
        Area obj5 = new Area(4.8);
    }
}
