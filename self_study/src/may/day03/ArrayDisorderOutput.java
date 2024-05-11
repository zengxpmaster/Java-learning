package may.day03;

import java.util.Random;

public class ArrayDisorderOutput {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3, 4, 5};
        //遍历并打乱
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成一个随机索引
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
