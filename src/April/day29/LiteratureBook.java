package April.day29;

public class LiteratureBook implements Book {
    double price;

    @Override
    public void getPrice(int page, float discount) {
        price = page * 0.08 * discount;
    }

    @Override
    public void showPrice() {
        System.out.println("这是一本文艺类书");
        System.out.println("这本文艺书的价格为" + price);
    }
}
