interface Shapeprg {
    public void area();
};

class Square implements Shapeprg {
    public void area()
    {
        int s = 5;
        double areasquare = s * s;
        System.out.println("Area of Sqare :" + areasquare);
    }
};

class Rectangle implements Shapeprg {
    public void area()
    {
        int l=8, b=9;
        double arearectangle=l*b;
        System.out.println("Area of Rectangle :"+arearectangle);
    }
};

class Area {
    public static void main(String args[]) {
        Square obj1 = new Square();
        obj1.area();
        Rectangle obj2 = new Rectangle();
        obj2.area();
    }
}
