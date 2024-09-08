package May.day18;

public class User {
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    // 无参构造方法
    public User() {
    }

    // 有参构造方法
    public User(String name, String password, String email, String gender, int age) {
        this.username = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    // getter和setter方法

    public void setUsername(String username) {
        this.username = username;
    }

}
