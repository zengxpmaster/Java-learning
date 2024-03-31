package march.day18;

public class test3 {
    public static void main(String[] args) {
        System.out.println("学号：202300210\t姓名：曾宪培");
        double a = 25.6, b = 3, e = 28, c = 8, d = 13.4, f = 65;
        double x, y;
        x = (e * d - b * f) / (a * d - b * c);
        y = (a * f - e * c) / (a * d - b * c);
        System.out.println("原方程组为：\n" + "25.6x+3y = 28\n" + "8x+13.4y = 65\n");
        System.out.println("方程组的解为\n" + "x=" + x);
        System.out.println("y=" + y);
    }
}
