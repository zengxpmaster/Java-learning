package may.day27;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        double[] arr = new double[10];// 动态初始化数组arr
        // 键盘录入数据
        System.out.println("姓名：曾宪培  学号：202300210");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        // 冒泡排序，从大到小排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        // 关闭流
        sc.close();
    }
}
