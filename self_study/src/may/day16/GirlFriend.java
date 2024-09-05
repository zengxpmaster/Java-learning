package may.day16;

public class GirlFriend {
    // 属性
    private String name;
    private int age;
    private String gender;

    // 无参构造方法
    public GirlFriend() {
        System.out.println("无参构造方法");
    }

    // 有参构造方法
    public GirlFriend(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // 对于每一个私有化的属性，都要提供对应的getter和setter方法
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    // age
    public void setAge(int a) {
        if (a >= 18 && a <= 40)
            age = a;
        else
            System.out.println("年龄不符合要求");
    }

    public int getAge() {
        return age;
    }

    // gender
    public void setGender(String g) {
        gender = g;
    }

    public String getGender() {
        return gender;
    }
}
