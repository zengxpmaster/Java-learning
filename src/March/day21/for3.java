package March.day21;

public class for3 {
    public static void main(String[] args) {
        int x = 2, i, count = 0;
        while (x < 100000000) {
            i = 2;
            while (i < x) {
                if (x % i == 0) {
                    break;
                }
                i++;
            }
            if (x == i) {
                System.out.printf("%d ", x);
                count++;
                if (count % 20 == 0)
                    System.out.print("\n");
            }
            x++;

        }

    }
}
