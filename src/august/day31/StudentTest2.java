package august.day31;

public class StudentTest2 {
    public static void main(String[] args) {
// * 定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
// * 学生的属性：学号，姓名，年龄。
// * 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
// * 要求2：添加完毕之后，遍历所有学生信息。
// * 要求3：通过id删除学生信息
// *       如果存在，则删除，如果不存在，则提示删除失败。
// * 要求4：删除完毕之后，遍历所有学生信息。
// * 要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
        // 创建对象数组
        Student[] arr = new Student[3];
        // 初始化
        Student s1 = new Student(1, "小诗诗", 20);
        Student s2 = new Student(2, "小苏苏", 22);
        Student s3 = new Student(3, "小红红", 23);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        // * 要求3：通过id删除学生信息
        // *       如果存在，则删除，如果不存在，则提示删除失败。
        int index = getIndex(arr, 3);
        if (index >= 0) {
            arr[index] = null;
            printArr(arr);
        } else {
            System.out.println("当前id不存在，删除失败！");
        }
        // * 要求4：删除完毕之后，遍历所有学生信息。

    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if (student != null) {
                System.out.println(student.getId() + ", " + student.getName() + ", " + student.getAge());
            }
        }
    }

    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if (student != null) {
                if (student.getId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

}
