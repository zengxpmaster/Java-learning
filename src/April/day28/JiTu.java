package April.day28;

import java.util.Scanner;

public class JiTu {
    public static void main(String[] args) {
        int kuntu, jiao, kun, tu;
        System.out.println("姓名：曾宪培\t学号：202300210");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入分别输入动物数量、jio量：");
        kuntu = input.nextInt();
        jiao = input.nextInt();
        if (jiao >= 2 * kuntu && jiao <= 4 * kuntu && jiao % 2 == 0) {
            tu = (jiao - 2 * kuntu) / 2;
            kun = kuntu - tu;
            System.out.printf("兔兔数量为：%2d只\n", tu);
            System.out.printf("坤坤数量为：%2d只", kun);
        } else System.out.println("输入错误");
    }
}