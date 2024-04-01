package april.day01;

import java.util.Scanner;

public class Supermarket {
    static double total = 0.0;
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        supermarket.show();
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        do {
            supermarket.manu();
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                //购买商品
                    supermarket.shopAtSupermarket();
                    if (total == 0){
                        System.out.print("是否继续逛超市?(y/n)");
                        if (!scanner.next().equalsIgnoreCase("y")) {
                            loop = false;
                            break;
                        }
                    }else {
                        break;
                    }
                case 2:
                //支付
                    supermarket.pay();
                    System.out.print("是否继续逛超市?(y/n)");
                    if (!scanner.next().equalsIgnoreCase("y")) {
                        loop = false;
                    }
                    if (total == 0){
                        break;
                    }
                case 3:
                    System.out.println("*********欢迎参与抽奖*************");
                    if (total >= 50.0){
                        System.out.println("*                              *");
                        System.out.println("*        您有一次抽奖机会         *");
                        System.out.println("*                              *");
                        System.out.println("*           正在抽奖中           *");
                        System.out.println("*                              *");
                        System.out.println("*********很遗憾,没有抽中**********\n");
                    }else {
                        System.out.println("抱歉，您没有抽奖机会\n");
                    }
                    break;
                default:
                    if (total == 0){
                        loop = false;
                    }else
                        System.out.println("请前往收银界面");
            }
        } while (loop);
        total = 0.0;
        supermarket.exit();
    }
    public void showProducts() {
        System.out.println("超市商品列表:");
        System.out.println("1. 苹果" + "\t￥ 1.5");
        System.out.println("2. 香蕉" + "\t￥ 2.5");
        System.out.println("3. 橘子" + "\t￥ 3.5");
    }
    public void show(){
        System.out.println("*********欢迎光临*************");
    }
    public void manu() {
        System.out.println("1. 购买商品");
        System.out.println("2. 收银结账");
        System.out.println("3. 幸运抽奖");
        System.out.println("4. 离开超市");
    }
    public void exit() {
        System.out.println("*********欢迎再次光临*************");
    }
    public void shopAtSupermarket() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showProducts();
            System.out.print("请选择商品:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("您挑选的商品是:苹果");
                    break;
                case 2:
                    System.out.println("您挑选的商品是:香蕉");
                    break;
                case 3:
                    System.out.println("您挑选的商品是:橘子");
                    break;
                default:
                    return;
            }

            System.out.print("请输入购买数量:");
            double num = scanner.nextDouble();
            double price = choice + 0.5;
            double add = num * price;
            System.out.printf("商品: %d 单价: %.2f 数量: %.2f 总价: %.2f\n", choice, price, num, add);
            total += add;

            System.out.print("是否继续挑选商品?(y/n)");
            String input = scanner.next();
            if (!input.equalsIgnoreCase("y")) {
                System.out.printf("您购买的所有商品总价为: %.2f\n请前往收银界面 \n" , total);
                return;
            }
        }
    }
    public void pay() {
        if (total != 0){
            while (true) {
                System.out.printf("您购买的所有商品总价为: %.2f\n" , total);
                System.out.print("请选择支付方式: \n1. WeChatPay/Alipay\t2. credit card\n3. account balance\t4. change\n");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("您选择的支付方式是: WeChatPay/Alipay");
                        digitalPay();
                        return;
                    case 2:
                        System.out.println("您选择的支付方式是: credit card");
                        creditCardPay();
                        return;
                    case 3:
                        System.out.println("您选择的支付方式是: account balance");
                        accountBalancePay();
                        return;
                    case 4:
                        System.out.println("您选择的支付方式是: change");
                        changePay();
                        return;
                    default:
                        System.out.println("输入错误, 请重新输入");
                }
            }
        }else System.out.println("您无需支付");
    }
    public void digitalPay() {
        System.out.println("请出示你的二维码");
        System.out.println("————————————————————");
        System.out.println("|                 |");
        System.out.println("|                 |");
        System.out.println("|                 |");
        System.out.println("|                 |");
        System.out.println("|                 |");
        System.out.println("————————————————————");
        System.out.println("！！！！支付成功！！！\n");
    }
    public void creditCardPay() {
        System.out.println("*************请刷卡***********");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入六位数密码: ");
            String password = scanner.next();
            if (password.length() == 6) {
                System.out.println("刷卡成功");
                return;
            } else {
                System.out.println("输入错误,请重新输入");
            }
        }
    }
    public void accountBalancePay() {
            System.out.println("系统正在维护，请更换支付方式");
    }
    private void changePay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请支付: ");
        double change = scanner.nextDouble();
        System.out.println("已收取人民币: " + change);
        if (change >= total) {
            System.out.println("找零: " + (change - total));
            System.out.println("谢谢惠顾");
        } else {
            System.out.println("金额不足");
        }
    }
}

