package may.day27;

import java.util.Scanner;

public class EmployeesSystem {
    public static void main(String[] args) {
        System.out.println("姓名：曾宪培  学号：202300210");
        String[][] arr = {
                {"刘德华", "男", "财务部", "3500"},
                {"周润发", "男", "市场部", "4800"},
                {"袁咏仪", "女", "开发部", "3600"},
                {"成龙", "男", "财务部", "2800"},
        };
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String[] result = Find.select(arr, name);
        // 遍历
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ", ");
        }

    }
}
