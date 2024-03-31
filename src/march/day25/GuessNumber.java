package march.day25;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int num = new Random().nextInt(10) + 1;
        System.out.println(num);
        int count = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            count += 1;
            System.out.print("请输入一个整数（1~10）：");
            int n = input.nextInt();
            if (n > num) {
                System.out.println("数字大了");
                continue;
            } else if (n < num) {
                System.out.println("数字小了");
                continue;
            } else {
                System.out.println("恭喜你猜对了");
                System.out.println("共猜了" + count + "次");
                break;
            }
        }
        input.close();
    }
}
