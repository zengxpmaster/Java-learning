package april.day29;

public class BuyChicken {
    public static void main(String[] args) {
        int x, y, z;
        for (z = 0; z < 100; ) {
            for (x = 0; x < 100; x++) {
                for (y = 0; y < 100; y++) {
                    if ((5 * x) + (3 * y) + (z / 3) == 100 && x + y + z == 100) {
                        System.out.println("公鸡🐓:" + x + " ，母鸡:" + y + " ,小鸡🐥:" + z);
                    }
                }
            }
            z = z + 3;
        }
    }
}
