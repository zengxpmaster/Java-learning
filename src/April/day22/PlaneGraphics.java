package April.day22;

/**
 * 抽象类
 * 可以包含普通变量和方法，也可以包含抽象方法
 * 不可以进行实例化
 */
public abstract class PlaneGraphics {
    private String shape; //定义形状

    public PlaneGraphics(String shape) {//定义有参构造方法
        this.shape = shape;
    }

    public PlaneGraphics() {//定义无参构造方法
        this("未知图形");
    }

    public abstract double area();//抽象方法没有方法体，没有{}

    public void print() {
        System.out.println(shape + "的面积是：" + area());
    }
}
