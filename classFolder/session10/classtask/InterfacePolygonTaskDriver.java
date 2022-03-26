package classFolder.session10.classtask;

interface Shape {
    default void draw() {
        System.out.println("Drwaing a " + this.getClass().getSimpleName());
    }
}

interface Polygon {

    double getArea();

    double getPerimeter();

    boolean isPolygon();

}

class Line implements Shape {

}

class Triangle implements Shape, Polygon {

    double side1, side2, side3;
    double area;
    double perimeter;
    int noOfSides;

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isPolygon() {
        // TODO Auto-generated method stub
        return false;
    }

    public void setSides(double side1, double side2, double side3) {
        if ((side1 + side2) < side3)
            System.out.println("worng values");
        else if ((side2 + side3) < side1)
            System.out.println("worng values");
        else if ((side1 + side3) < side2)
            System.out.println("worng values");
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

}

class Rectangle implements Shape, Polygon {

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isPolygon() {
        // TODO Auto-generated method stub
        return false;
    }

}

public class InterfacePolygonTaskDriver {
    public static void main(String[] args) {
        // to do
    }
}
