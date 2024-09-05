package august.day31;

public class GirlFriendTest {
    public static void main(String[] args) {
        // 1.定义数组
        GirlFriend[] arr = new GirlFriend[4];
        // 2.创建对象
        GirlFriend gf1 = new GirlFriend("小诗诗", 18, "萌妹子", "唱");
        GirlFriend gf2 = new GirlFriend("小丹丹", 19, "萌妹子", "跳");
        GirlFriend gf3 = new GirlFriend("小惠惠", 20, "萌妹子", "rap");
        GirlFriend gf4 = new GirlFriend("小莉莉", 21, "萌妹子", "篮球");
        //
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        // 3.求平均年龄
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum = sum + gf.getAge();
        }
        int avg = sum / arr.length;
        // 打印信息
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if (gf.getAge() < avg) {
                System.out.println(gf.getName() + ", " + gf.getAge() + ", " + gf.getGender() + ", " + gf.getHobby());
                count++;
            }
        }
        System.out.println(count + "个");
    }

}
