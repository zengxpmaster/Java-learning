package june.day13;

import java.io.*;

/**
 * IO流练习
 */
public class FileCopy {
    public static void main(String[] args) {
        String oldFile = "d:\\zengx\\Pictures\\PixPinAutoSave\\PixPin_2024-05-18_13-46-24.png";
        String newFile = "D:\\zengx\\Desktop\\test1.txt";
        copy(oldFile, newFile);
    }

    public static void copy(String oldFile, String newFile) {
        File ofile = new File(oldFile);
        File nfile = new File(newFile);
        if (ofile.exists()) {
            try {
                FileInputStream in = new FileInputStream(ofile);
                FileOutputStream out = new FileOutputStream(nfile);
                byte[] buff = new byte[1024];
                int num;
                while ((num = in.read(buff)) != -1) {
                    out.write(buff, 0, num);
                }
                out.close();
                in.close();
                System.out.println("复制成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件不存在");
        }
    }
}
