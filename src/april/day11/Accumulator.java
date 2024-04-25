package april.day11;

/**
 * 练习static修饰的 静态变量、静态方法 和实例变量、实例方法 的区别。
 * 类：累加器
 */
//public 访问控制修饰符：修饰范围：所有包中，不同包中，所有类中都可以访问
public class Accumulator {
    //无修饰符：friendly/default（缺省）
    //访问范围：在同一个类，同一个包中的其他类。

    int sum;//实例变量
    public static int stSum;//静态变量

    //private 访问范围：同一个类
    //protected 访问范围：同一个类，同一个包中的其他类，不同包的子类。

    protected void test() {
    }//普通成员方法

    public static void stTest() {
    }//静态成员方法

    public static void main(String[] args) {//static修饰的方法，直接调用的变量和方法也必须为static修饰
        System.out.println(stSum);
        System.out.println(stSum);

        stTest();

        //实例变量、方法和静态变量、方法的区别
        //普通方法和变量   只有在类被对象实例化的时候开辟空间
        //实例对象有多少个就开辟多少个空间
        Accumulator ac1 = new Accumulator();
        ac1.sum += 10;//实例变量
        ac1.stSum += 10;//静态变量
        //创建第2个对象
        Accumulator ac2 = new Accumulator();
        ac2.sum += 10;//实例变量
        ac2.stSum += 10;//静态变量

        System.out.println(ac1.sum);//10
        System.out.println(ac1.stSum);//20

        ac1.test();
        ac1.stTest();

        //static修饰的方法和变量可以直接用 类.变量 类.方法
        //static在调用时，只会开辟一次内存空间
        Accumulator.stSum += 10;
        System.out.println(Accumulator.stSum);//30
        Accumulator.stTest();

    }

}
