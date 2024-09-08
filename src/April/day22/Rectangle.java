package April.day22;

public class Rectangle extends PlaneGraphics {
    protected double length;//长
    protected double width;//宽

    public Rectangle() {
    }//定义无参构造方法

    public Rectangle(double length, double width) {//定义有参构造方法
        super("矩形");
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}
