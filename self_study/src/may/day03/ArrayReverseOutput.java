package may.day03;

/**
 * 数组倒序输出练习
 */
public class ArrayReverseOutput {
    public static void main(String[] args) {
        /*定义两个变量，并交换两个变量记录的值*/
        int a1 = 10, a2 = 10;
        int b1 = 20, b2 = 20;
        //错误写法：
        a1 = b1;
        b1 = a1;
        //System.out.println(a1);//20
        //System.out.println(b1);//20

        //正确写法
        int temp = a2;
        a2 = b2;
        b2 = temp;
        System.out.println(a2);//20
        System.out.println(b2);//10

        /*定义一个数组，将数组的0索引与最大索引处的值进行交换*/
        int[] a3 = {1, 2, 3, 4, 5};
        //将数组的0索引与最大索引处的值进行交换
        temp = a3[0];
        a3[0] = a3[4];
        a3[4] = temp;
        //遍历数组
        for (int i = 0; i < a3.length; i++) {
            System.out.print(a3[i] + " ");
        }
        System.out.print("\n");
        /*数组倒序输出*/
        int[] a4 = {1, 2, 3, 4, 5};
        for (int i = 0, j = a4.length - 1; i < j; i++, j--) {
            temp = a4[i];
            a4[i] = a4[j];
            a4[j] = temp;
        }
        //遍历
        for (int i = 0; i < a4.length; i++) {
            System.out.print(a4[i] + " ");
        }
    }
}
