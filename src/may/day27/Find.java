package may.day27;

public class Find {
    public static String[] select(String[][] table, String name) {
        for (int i = 0; i < table.length; i++) {
            if (table[i][0].equals(name)) {
                return table[i];
            }
        }
        return null;
    }
}