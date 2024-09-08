package March.day18;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        System.out.println("请输入一个三位整数：");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int b = num / 100;
        int c = (num - b * 100) / 10;
        int d = (num - b * 100 - c * 10);
        System.out.println("逆序输出为" + d + c + b);
        scan.close();
    }
}
