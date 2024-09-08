package April.day18;

import java.text.DecimalFormat;

public class Student extends Person {
    private double av;
    private String no;
    private int scoreEn;
    private int scoreMath;
    private int scoreCh;

    public Student(String name, String sex, int age, String no, int scoreEn, int scoreMath, int scoreCh) {
        super(name, sex, age);
        this.no = no;
        this.scoreEn = scoreEn;
        this.scoreMath = scoreMath;
        this.scoreCh = scoreCh;
    }


    public double aver() {
        av = (scoreEn + scoreMath + scoreCh) / 3.0;
        // 创建一个DecimalFormat对象，设置保留两位小数
        DecimalFormat df = new DecimalFormat("#.00");

        // 使用DecimalFormat对象对av进行格式化
        String formattedAv = df.format(av);

        // 将格式化后的字符串转换回double类型（可选，取决于您后续如何使用av）

        return Double.parseDouble(formattedAv);
    }

    public int max() {
        int maxScore = scoreEn;
        if (scoreMath > maxScore) {
            maxScore = scoreMath;
        }
        if (scoreCh > maxScore) {
            maxScore = scoreCh;
        }
        return maxScore;
    }

    public int min() {
        int minScore = scoreEn;
        if (scoreMath < minScore) minScore = scoreMath;
        if (scoreCh < minScore) minScore = scoreCh;
        return minScore;
    }

    public String toString() {
        //System.out.println(", 学号: " + no + ", 平均分: " + aver() + ", 最高分: " + max() + ", 最低分: " + min());
        return super.toString() + ", 学号: " + no + ", 平均分: " + aver() + ", 最高分: " + max() + ", 最低分: " + min();
    }
}
