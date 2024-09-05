package may.day16;

public class GirlFriendTest {
    public static void main(String[] args) {
        // 创建对象, 调用无参构造方法
        // 在创建对象时，虚拟机会自动调用构造方法，进行初始化。
        GirlFriend gf1 = new GirlFriend();
        // gf1.name = "小红";
        // gf1.age = 18;
        // gf1.gender = "小仙女";
        gf1.setName("小红");
        gf1.setAge(18);
        gf1.setGender("小仙女");
        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());
        // 创建对象, 调用有参构造方法
        GirlFriend gf2 = new GirlFriend("小李", 19, "小仙男");
        System.out.println(gf2.getName());
        System.out.println(gf2.getAge());
        System.out.println(gf2.getGender());
    }
}
