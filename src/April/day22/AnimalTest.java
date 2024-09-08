package April.day22;

/**
 * 实现多态（动态多态）
 * 继承、重写、向上转型
 */
public class AnimalTest {
    public static void main(String[] args) {
        //向上转型
        Animal animal;
        animal = new Cat();
        animal.eat();
        animal.run();
        animal = new Dog();
        animal.eat();
        animal.run();
        animal = new WkZ("虎");
        System.out.println("wkz是" + animal.species);
        animal.eat();
        animal.run();
    }
}
