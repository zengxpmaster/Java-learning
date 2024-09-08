package May.day16;

import java.util.Random;

public class GuessingGame {
    String type;
    Random random = new Random();
    int i = random.nextInt(3);

    String getType() {

        switch (i) {
            case 0:
                type = "石头";
                break;
            case 1:
                type = "剪刀";
                break;
            case 2:
                type = "布";
                break;
        }
        return type;
    }
}
