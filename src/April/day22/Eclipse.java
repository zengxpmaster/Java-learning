package April.day22;

public class Eclipse extends PlaneGraphics {
    protected double radius_a;
    protected double radius_b;
    final float PI = 3.1415926F;

    public Eclipse() {
    }//定义无参构造方法

    public Eclipse(double radius_a, double radius_b) {//定义有参构造方法
        super("椭圆");
        this.radius_a = radius_a;
        this.radius_b = radius_b;
    }

    public double area() {
        return PI * radius_a * radius_b;
    }
}
