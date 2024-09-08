package August.day31;

public class StudentTest {
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
        // 要求1
        // 添加学生4
        Student s4 = new Student(4, "小孙孙", 29);
        // 唯一性判断

        boolean flag = contains(arr, s4);
        if (flag) {
            // 已存在：不添加
            System.out.println("id存在，请更换id。");
        } else {
            // 不存在：添加
            // 添加进入数组
            int count = getCount(arr);
            if (count == arr.length) {
                // 数组已满：创建新数组，使其长度比原数组+1
                Student[] arr1 = createNewArr(count, arr);
                arr1[count] = s4;
                // * 要求2：添加完毕之后，遍历所有学生信息。

                printArr(arr1);
            } else {
                // 数组未满：
                arr[count] = s4;
                // * 要求2：添加完毕之后，遍历所有学生信息。

                printArr(arr);
            }
        }
    }

    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                if (id == i)
                    return i;
            }
        }
        return -1;
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if (student != null) {
                System.out.println(student.getId() + ", " + student.getName() + ", " + student.getAge());
            }
        }
    }

    public static Student[] createNewArr(int count, Student[] arr) {
        Student[] newArr = new Student[(count + 1)];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if (student == null) {
                break;
            }
            count++;
        }
        return count;
    }

    public static boolean contains(Student[] arr, Student s) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if (student == null) {
                continue;
            } else {
                if (student.getId() == s.getId()) {
                    return true;
                }
            }
        }
        return false;
    }
}
