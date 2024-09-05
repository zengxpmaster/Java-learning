package may.day16;

/**
 * 练习匿名内部类
 */
abstract class firework {
    abstract void show();
}

public class FireWorks {
    public static void main(String[] args) {
        new firework() {
            @Override
            void show() {
                System.out.println("展示");
            }
        }.show();
    }
}
