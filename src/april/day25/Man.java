package april.day25;

public class Man extends Person {
    private String wife;
    private double wife_money;

    Man(String name, double money, String wife, double wife_money) {
        super(name, money);
        this.wife = wife;
        this.wife_money = wife_money;
    }

    void show() {
        super.show();
        System.out.printf("妻子[%s]有[%.0f]美元\n", wife, wife_money);
    }
}
