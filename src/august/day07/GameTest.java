package august.day07;

public class GameTest {
    public static void main(String[] args) {
        // 创建第一位角色
        Role r1 = new Role("旅行者", 100, '女', "");

        // 创建第二位角色
        Role r2 = new Role("散兵", 100, '男', "");
        // 开始战斗
        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r2.getName() + "被K.O了");
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r1.getName() + "被K.O了");
                break;
            }
        }
    }
}
