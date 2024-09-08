package April.day18;

public class Person {

    private String name;
    private String sex;
    private int age;


    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String toString() {
        //System.out.print("姓名: " + name + ", 性别: " + sex + ", 年龄: " + age);
        return "姓名: " + name + ", 性别: " + sex + ", 年龄: " + age;
    }
}  
  

