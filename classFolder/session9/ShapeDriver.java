package classFolder.session9;

abstract class Shape {
    String name;
    double area;
    double perimeter;

    protected Shape(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    

    @Override
    public String toString() {
        return "Shape [name=" + name + ", area=" + area + ", perimeter=" + perimeter + "]";
    }

    abstract void calcArea();
    abstract void calcPerimeter();
    abstract void draw();
}

class Rectangle extends Shape {

    double length;
    double breath;

    public Rectangle(String name, double length, double breath) {
        super(name);
        this.length = length;
        this.breath = breath;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }

    @Override
    void calcArea() {
        area = length * breath;
    }

    @Override
    void calcPerimeter() {
        perimeter = (length + breath) * 2;

    }

    @Override
    void draw() {
        calcArea();
        calcPerimeter();
        System.out.println(String.format("%nDrwaing a Rectangle of length:%.2f and breadth:%.2f", length, breath));
    }

}

class Square extends Shape {

    double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    void calcArea() {
        area = side * side;

    }

    @Override
    void calcPerimeter() {
        perimeter = 4 * side;

    }

    @Override
    void draw() {
        calcArea();
        calcPerimeter();
        System.out.println(String.format("%nDrwaing a Sqaure with side:%.2f ", side));
    }

}

class Circle extends Shape {

    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void calcArea() {
        area = Math.PI * radius * radius;
    }

    @Override
    void calcPerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    @Override
    void draw() {
        calcArea();
        calcPerimeter();
        System.out.println(String.format("%nDrwaing a Cirlce with radius:%.2f", radius));
    }

}

public class ShapeDriver {
    public static void main(String[] args) {

        Shape shape = new Rectangle("TallRectangle", 10, 5);
        shape.draw();
        System.out.println(shape);

        shape = new Square("BoxySquare", 2);
        shape.draw();
        System.out.println(shape);

        shape = new Circle("PerfectCircle", 5);
        shape.draw();
        System.out.println(shape);

    }
}
