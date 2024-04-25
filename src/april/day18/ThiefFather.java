package april.day18;

/**
 * 继承
 * <p>
 * 类：小偷爸爸
 * 属性:偷窃工具(stealTools)
 * 行为:偷电瓶车(steal)
 */
public class ThiefFather {

    String stealTools;

    ThiefFather(String stealTools) {
        this.stealTools = stealTools;
    }

    public void steal() {
        System.out.println("使用了"
                + stealTools +
                "偷走了一辆电瓶车");
    }


}

