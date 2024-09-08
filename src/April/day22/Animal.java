package April.day22;

/**
 * 面向对象编程：多态
 * 父类：动物类
 * 成员变量species（种类）、eat（）方法和run（）方法
 */
public class Animal {
    String species;

    public void eat() {
        System.out.println("所有动物都会eat");
    }

    public void run() {
        System.out.println("所有动物都会run");
    }
}
