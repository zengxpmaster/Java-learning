package march.day21;

public class for2 {
    public static void main(String[] args) {
        int a, b, c;
        for (a = 1; a <= 9; a++) {
            for (b = 1; b <= a; b++) {
                c = a * b;
                System.out.printf("%d*%d=%2d\t", b, a, c);
            }
            System.out.printf("\n");
        }
    }
}
