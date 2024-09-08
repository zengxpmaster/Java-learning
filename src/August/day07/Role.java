package August.day07;

import java.util.Random;

public class Role {
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
    String[] attacks_desc = {
            " %s 使出了一招【背心钉】，转到对方的身后，一掌向 %s 背心的灵台穴拍去。",
            " %s 使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向 %s 。",
            " %s 大喝一声，身形下伏，一招【劈雷坠地】，捶向 %s 双腿。",
            " %s 运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向 %s 。",
            " %s 阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向 %s 。",
            " %s 上步抢身，招中套招，一招【劈挂连环】，连环攻向 %s 。"
    };
    String[] injureds_desc = {
            "结果 %s 退了半步，毫发无损",
            "结果给 %s 造成一处伤",
            "结果一击命中， %s 痛得弯下腰",
            "结果 %s 痛苦地闷哼了一声，显然受了点内伤",
            "结果 %s 摇摇晃晃，一跤摔倒在地",
            "结果 %s 脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声， %s 口中鲜血狂喷而出",
            "结果 %s 一声惨叫，像滩软泥般塌了下去"
    };
    private String name;
    private int blood;
    private char gender;
    private String face;

    public Role() {
    }

    public Role(String name, int blood, char gender, String face) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (gender == '男') {
            int i = r.nextInt(boyfaces.length);
            this.face = boyfaces[i];
        } else if (gender == '女') {
            int i = r.nextInt(girlfaces.length);
            this.face = girlfaces[i];
        } else
            this.face = "面目狰狞";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role) {
        // 计算攻击伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        // 计算剩余血量
        int remainblood = role.getBlood() - hurt;
        remainblood = remainblood < 0 ? 0 : remainblood;
        role.setBlood(remainblood);
        // 输出战斗招式语句
        int i = r.nextInt(attacks_desc.length);
        String kongfu = attacks_desc[i];
        System.out.printf(kongfu + " ", this.getName(), role.getName());
        // 输出受击语句
        i = r.nextInt(3);
        System.out.println();
        if (hurt < 5 && remainblood > 10) {
            String injureds = injureds_desc[i];
            System.out.printf("  造成了%2d点伤害, " + injureds + "。\n", hurt, role.getName());
        } else if (hurt >= 5 && hurt <= 13 && remainblood > 10) {
            String injureds = injureds_desc[i + 3];
            System.out.printf("  造成了%2d点伤害, " + injureds + "。\n", hurt, role.getName());
        } else if (hurt > 13 && remainblood > 10) {
            i = r.nextInt(2) + 5;
            String injureds = injureds_desc[i];
            System.out.printf("  造成了%2d点伤害, " + injureds + "。\n", hurt, role.getName());
        } else if (remainblood <= 10) {
            String injureds;
            if (hurt < 9) {
                injureds = injureds_desc[i + 3];
            } else {
                injureds = injureds_desc[7];
            }
            System.out.printf("  造成了%2d点伤害, " + injureds + "。\n", hurt, role.getName());
        }
        // 输出格斗流程语句
        // System.out.println(this.getName() + " 挥拳打了 " + role.getName() + " 一下，" +
        //         "造成了" + hurt + "点伤害，" + role.getName() + " 还剩" + remainblood + "点血。");
    }
}
