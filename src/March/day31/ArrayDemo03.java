package March.day31;

public class ArrayDemo03 {
    public static void main(String[] args) {
        // 定义一个数组，
        int[] arr = {1, 2, 3, 4, 5};
        //长度：5
        //最大索引：4
        //最小索引：0
        System.out.println(arr[10]);
//  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
//  at march.day31.ArrayDemo03.main(ArrayDemo03.java:10)

        System.out.println(arr[-1]);
//  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5
//  at march.day31.ArrayDemo03.main(ArrayDemo03.java:14)

        //小结
        //数组越界异常
        //ArrayIndexOutOfBoundsException
    }
}
