package august.day31;

public class PhoneTest {
    public static void main(String[] args) {
        // 新建一个对象数组
        Phone[] arr = new Phone[3];
        // 创建对象
        Phone p1 = new Phone("xiaomi", 1999, "red");
        Phone p2 = new Phone("huawei", 4999, "white");
        Phone p3 = new Phone("oppo", 3999, "blue");
        // 把对象放入数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        // 获取价格平均值
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }
        int avg = 0;
        avg = sum / arr.length;
        System.out.println(avg);
        // 保留小数
        double avg1;
        avg1 = sum * 1.0 / arr.length;
        System.out.println(avg1);
    }
}
