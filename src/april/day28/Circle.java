package april.day28;

public class Circle implements TwoDimShape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
    }
}
