package april.day25;

public class Person {
    private String name;
    private double money;

    Person(String name, double money) {
        this.name = name;
        this.money = money;
    }

    void show() {
        System.out.printf("[%s]有[%.0f]美元\n", name, money);
    }
}
