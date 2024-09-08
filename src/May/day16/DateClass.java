package May.day16;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getInstance();
        System.out.println(dateFormat.format(date));
        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        System.out.println(dateFormat.format(date));

    }
}
