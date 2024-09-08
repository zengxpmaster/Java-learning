package April.day29;

public class TeacheringBook implements Book {
    double price;

    @Override
    public void getPrice(int page, float discount) {
        price = page * 0.05 * discount;
    }

    @Override
    public void showPrice() {
        System.out.println("这是一本教材类书");
        System.out.println("这本教材书的价格为" + price);
    }
}