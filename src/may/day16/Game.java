package may.day16;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Game {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(df.format(date));
        GuessingGame game = new GuessingGame();
        game.getType();
        System.out.println(game.i);
    }

}
