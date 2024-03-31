package march.day21;

import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        int i = 0, sum = 0, n = 100;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        do {
            sum = sum + i;
            i++;
        } while (i <= n);
        input.close();
        System.out.println(sum);
    }
}
