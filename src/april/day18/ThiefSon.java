package april.day18;

/**
 * 类：小偷儿子
 * 行为：逃跑(run)
 * 子类可以继承父类中的所有方法和变量
 * 并且可以再创建自己的变量和方法
 * <p>
 * 子类不可以继承父类的创造方法
 */
public class ThiefSon extends ThiefFather {
    ThiefSon(String stealTools) {
        super(stealTools);
    }

    public void steal() {
        super.steal();
        System.out.println("小偷二代，"
                + "进化出50%的概率"
                + "可以从警察手中逃脱");
    }

}