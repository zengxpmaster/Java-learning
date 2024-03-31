package march.day21;

import java.util.Scanner;

public class zjh {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt(), count = 0;
        System.out.println("请判断2~" + i + "的素数:");
        input.close();
        for (; i > 1; i--) {
            boolean s = false;
            for (int b = 2; b <= Math.sqrt(i) || i <= 3; b++) {
                if (i == 2) {
                    s = true;
                } else if (i % b == 0) {
                    break;
                } else if (b > Math.sqrt(i) - 1) {
                    s = true;
                }
                if (s == true) {
                    System.out.print(i + " ");
                    count++;
                    if (count % 20 == 0)
                        System.out.println();
                    break;
                }

            }
        }
    }
}