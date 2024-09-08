package May.day14;

import java.util.Random;

public class CaptchaTest {
    /**
     * 要求：
     * 1.验证码是5位
     * 验证码格式：
     * 前4位是大写字母或小写字母
     * 最后一位是数字
     */
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                chs[i] = (char) ('A' + i);
            } else {
                chs[i] = (char) ('a' + i - 26);
            }
        }
        String captcha = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(chs.length);
            captcha += chs[index];
        }
        int num = r.nextInt(10);
        captcha += num;
        System.out.println(captcha);

    }
}
