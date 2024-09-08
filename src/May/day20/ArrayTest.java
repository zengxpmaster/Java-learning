package May.day20;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        // 静态初始化
        int[] arr = {1, 2, 3, 4, 5};
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // 动态初始化
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        // 遍历数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        String str;
        str = Arrays.toString(arr1);
        System.out.println(str);
        // 数组排序
        int[] arr2 = {1, 1, 4, 5, 1, 4};
        System.out.println("排序前：" + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("排序后：" + Arrays.toString(arr2));
    }
}
