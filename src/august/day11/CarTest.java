package august.day11;

import java.util.Scanner;

/**
 * 对象数组练习
 * 定义数组存储3部汽车对象
 * 汽车的属性：品牌，价格，颜色
 * 创建三个汽车对象，数据通过键盘录入而来，并把数据存入到数组当中
 */
public class CarTest {
    public static void main(String[] args) {
        // 创建对象数组
        Car[] arr = new Car[3];
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            Car car = new Car();
            // 记录car品牌
            System.out.println("请输入第" + (i + 1) + "辆车品牌");
            String brand = sc.next();
            car.setBrand(brand);
            // 记录car价格
            System.out.println("请输入第" + (i + 1) + "辆车价格");
            double price = sc.nextDouble();
            car.setPrice(price);
            // 记录car颜色
            System.out.println("请输入第" + (i + 1) + "辆车颜色");
            String color = sc.next();
            car.setColor(color);
            arr[i] = car;

        }
        // 遍历输出
        for (int i = 0; i < arr.length; i++) {
            Car c = arr[i];
            System.out.println("第" + (i + 1) + "辆车品牌：" + c.getBrand());
            System.out.println("第" + (i + 1) + "辆车价格：" + c.getPrice());
            System.out.println("第" + (i + 1) + "辆车颜色：" + c.getColor());
        }
    }

}
