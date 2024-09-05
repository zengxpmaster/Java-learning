package may.day13;

import java.util.Scanner;

public class BuyTicket {
    public static void main(String[] args) {
        int ticket, month, seat;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入原票价");
        ticket = input.nextInt();
        System.out.println("请输入购买月份");
        month = input.nextInt();
        System.out.println("请输入购买座位类型：0.经济舱 1.头等舱");
        seat = input.nextInt();
//        if (month >= 5 && month <= 10) {
//            if (seat == 0) {
//                ticket = (int) (ticket * 0.6);
//            } else if (seat == 1) {
//                ticket = (int) (ticket * 0.7);
//            } else {
//                System.out.println("输入的座位类型有误");
//            }
//        } else if (month >= 1 && month < 5 || month <= 12 && month > 10) {
//            if (seat == 0) {
//                ticket = (int) (ticket * 0.85);
//            } else if (seat == 1) {
//                ticket = (int) (ticket * 0.9);
//            } else {
//                System.out.println("输入的座位类型有误");
//            }
//        } else {
//            System.out.println("您输入的月份有误");
//        }

//  Ctrl + Alt + M  自动抽取方法
//  Ctrl + Alt + M  自动抽取方法
//  Ctrl + Alt + M  自动抽取方法
        if (month >= 5 && month <= 10) {
            ticket = getTicket(seat, ticket, 0.6, 0.7);
        } else if (month >= 1 && month < 5 || month <= 12 && month > 10) {
            ticket = getTicket(seat, ticket, 0.85, 0.9);
        } else {
            System.out.println("您输入的月份有误");
        }
        System.out.println(ticket);
    }

    private static int getTicket(int seat, int ticket, double x, double x1) {
        if (seat == 0) {
            ticket = (int) (ticket * x);
        } else if (seat == 1) {
            ticket = (int) (ticket * x1);
        } else {
            System.out.println("输入的座位类型有误");
        }
        return ticket;
    }
}
