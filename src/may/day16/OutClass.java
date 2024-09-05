package may.day16;

/**
 * 内部类的练习：
 * 成员内部类
 * 局部内部类
 * 静态内部类
 * 匿名内部类
 */
public class OutClass {
    int i;// 成员变量

    public static void main(String[] args) {
//        创建外部类对象
        OutClass out = new OutClass();
        out.i = 10;
        System.out.println(out.i);// 10
//        创建内部类对象
        OutClass.InnerClass inner = out.new InnerClass();
        inner.show();// 调用成员内部类的方法
        // 创建静态内部类
        OutClass.InnerClass3 inner3 = new InnerClass3();
        inner3.show();
    }

    // 局部内部类
    public void method() {
        int a;
        class InnerClass2 {
            // 局部内部类的方法
            public void show() {
                System.out.println("局部内部类的方法");
            }
        }
    }

    // 静态内部类
    public static class InnerClass3 {
        // 静态内部类的变量
        public static int j;

        // 静态内部类的方法
        public void show() {
            System.out.println("静态内部类的方法");
        }
    }

    // 成员内部类
    public class InnerClass {
        // 成员内部类的方法
        public void show() {
            System.out.println("成员内部类的方法");
        }
    }

}
