package April.day29;

public class BookTest {
    public static void main(String[] args) {
        Book b1, b2, b3;
        b1 = new ScienceBook();
        b2 = new LiteratureBook();
        b3 = new TeacheringBook();
        b1.getPrice(350, 0.8f);
        b2.getPrice(350, 0.8f);
        b3.getPrice(350, 0.8f);
        b1.showPrice();
        b2.showPrice();
        b3.showPrice();
    }
}
