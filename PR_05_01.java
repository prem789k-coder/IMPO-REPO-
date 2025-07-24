abstract class Shape {
    public abstract int noofedges();
};

class Square extends Shape {
    public int noofedges() {
        return 4;
    }
};

class Triangle extends Shape {
    public int noofedges() {
        return 3;
    }
};

class Octagon extends Shape {
    public int noofedges() {
        return 8;
    }
};

class Hexagon extends Shape {
    public int noofedges() {
        return 6;
    }
};

class Edge {
    public static void main(String args[]) {
        Square se1 = new Square();
        int se = se1.noofedges();
        System.out.println("No of Edges of Sqaure : " + se);
        Triangle te1 = new Triangle();
        int te = te1.noofedges();
        System.out.println("No of Edges of Triangle : " + te);
        Octagon oe1 = new Octagon();
        int oe = oe1.noofedges();
        System.out.println("No of Edges of Triangle : " + oe);
        Hexagon he1 = new Hexagon();
        int he = he1.noofedges();
        System.out.println("No of Edges of Triangle : " + he);
    }
}
