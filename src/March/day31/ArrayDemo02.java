package March.day31;

public class ArrayDemo02 {
    public static void main(String[] args) {
/*
        定义一个数组，用于存班级50个学生的姓名
        姓名未知，学生报道后，再进行添加
*/
        //格式：
        //数据类型[] 数组名 = new 数据类型[长度];、
        String[] names = new String[50];
        //添加学生
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        //获取
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);//null

        //数组初始化的规律
        //整数数组：0
        //小数数组：0.0
        //字符数组：'\u0000'
        //布尔数组：false
        //引用数组：null
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
