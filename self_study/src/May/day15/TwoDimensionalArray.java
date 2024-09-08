package May.day15;

public class TwoDimensionalArray {
    public static void main(String[] args) {
//         数据类型[][] 数组名 = new 数据类型[行数][列数];
//         动态初始化
        int[][] arr = new int[3][4];
//         表示3行4列的二维数组
//         静态初始化
        int[][] arr1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
//         二维数组遍历
        for (int i = 0; i < arr1.length; i++) {
//             必须嵌套循环，否则得到的是地址值
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
//         给二维数组赋值
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;
        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 7;
        arr[1][3] = 8;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//         Ctrl + Alt + L 快捷格式化代码
//         Ctrl + D 快捷复制该行代码
//         静态初始化二维数组 arr2
//         静态初始化二维数组 arr2
//         静态初始化二维数组 arr2
        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
    }
}
