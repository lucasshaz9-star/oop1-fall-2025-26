abstract class Shape {

    private String shape;

    public Shape(String shape) {
        System.out.println("Shape Constructor called");
        this.shape = shape;
    }

    abstract double calculateArea();

    public void displayShape() {
        System.out.println("Shape: " + shape);
    }

    
    public abstract String toString();
}
class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super("Circle");
        System.out.println("Circle Constructor called");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}
class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle with length " + length + " and width " + width;
    }
}
public class TestAbstraction {
    public static void main(String[] args) {

        Shape s1 = new Rectangle(2, 3);
        s1.displayShape();
        System.out.println("Area: " + s1.calculateArea());
        System.out.println(s1);

        System.out.println();

        Shape s2 = new Circle(4);
        s2.displayShape();
        System.out.println("Area: " + s2.calculateArea());
        System.out.println(s2);
    }
}
