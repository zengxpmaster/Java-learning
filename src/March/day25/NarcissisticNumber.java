package March.day25;

public class NarcissisticNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {   //所有3位整数
            //拆分各个位数
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            //判断是否符合水仙花数
            if (i == (ge * ge * ge) + (shi * shi * shi) + (bai * bai * bai)) {
                System.out.printf("%d\t", i);
            }
        }
    }
}
