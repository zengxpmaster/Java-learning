package june.day02;

import java.util.Scanner;

/**
 * Encrypt类提供了简单的字符加密功能。
 * 它通过将字母和数字字符向前移动5个位置来实现加密，同时考虑到字母循环和数字循环的情况。
 */
public class Encrypt {
    /**
     * 程序的入口点。
     * 从标准输入读取一行文本，然后对其进行加密，并将加密后的结果打印到标准输出。
     * 如果输入包含非字母和数字字符，则认为输入非法。
     *
     * @param args 命令行参数，未使用
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        boolean flag = true;
        for (int i = 0; i < chars.length; i++) {
            // 判断字符是否为字母或数字
            if (chars[i] >= 'a' && chars[i] <= 'z'
                    || chars[i] >= 'A' && chars[i] <= 'Z'
                    || chars[i] >= '0' && chars[i] <= '9'
            ) {
                // 字符加密，字母和数字分别向前移动5个位置
                chars[i] = (char) (chars[i] + 5);
                // 处理字母循环的情况
                if (chars[i] > 'z' && chars[i] < (char) ('z' + 5)) {
                    chars[i] = (char) (chars[i] - 26);
                } else if (chars[i] > 'Z' && chars[i] < (char) ('Z' + 5)) {
                    chars[i] = (char) (chars[i] - 26);
                } else if (chars[i] > '9' && chars[i] < (char) ('9' + 5)) {
                    // 处理数字循环的情况
                    chars[i] = (char) (chars[i] - 10);
                }
            } else {
                // 输入包含非字母和数字字符，认为输入非法
                flag = false;
            }
        }
        // 根据输入是否合法打印加密后的结果或错误信息
        if (flag) {
            System.out.println(chars);
        } else {
            System.out.println("输入非法");
        }
    }
}
