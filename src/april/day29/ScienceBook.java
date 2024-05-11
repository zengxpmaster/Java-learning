package april.day29;

public class ScienceBook implements Book {
    double price;

    @Override
    public void getPrice(int page, float discount) {
        price = discount * page * 0.10;
    }

    @Override
    public void showPrice() {
        System.out.println("这是一本科技类书");
        System.out.println("这本科技书的价格为" + price);
    }
}
