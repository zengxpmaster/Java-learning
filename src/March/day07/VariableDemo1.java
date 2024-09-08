/**
 * 此源码为数据类型的练习
 */
package March.day07;

public class VariableDemo1 {
    public static void main(String[] args) {
        /*
        整型：byte，short，int，long
         */
        //byte 1byte=8bit           -128~127
        byte a = 127;
        //short 2byte=16bit         -32768~32767
        short b = 123;
        //int 4byte=32bit           -2^31~2^31-1
        int c = 123456;
        //long 8byte=64bit          -2^63~2^63-1
        long d = 123456789L;

        /*
        浮点型：float，double
         */
        //float 4byte=32bit         [-3.4E38~-1.4E-45]&[1.4E-45~3.4E38]
        float e = 3.14F;
        //double 8byte=64bit        4.9000000e-324 ~ 1.797693e+308
        double f = 3.1415;

        /*
        字符型：char
         */
        //char 2byte=16bit          0-65535
        char c1 = 'a';      //定义字符并赋值
        char c2 = 65;       //使用Unicode表中的排序位置表示字符
        char c3 = '\\';     //定义反斜杠转义字符
        char c4 = '\u006b'; //使用十六进制表示字符
        char c5 = '\153';   //使用八进制表示字符
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        /*
        布尔型：boolean
         */
        //boolean 1byte=8bit
        boolean m = true;

    }
}
