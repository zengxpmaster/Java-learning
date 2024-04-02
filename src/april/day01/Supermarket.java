package april.day01;


import java.util.Scanner;

public class Supermarket {
    static double total = 0.0;
    boolean isPaid = false;
    /**
     * 主函数：模拟超市购物、支付及抽奖流程。
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        // 创建一个超市对象
        Supermarket supermarket = new Supermarket();
        // 展示超市信息
        supermarket.show();

        // 初始化循环购物标志
        boolean loop = true;
        // 创建扫描器用于接收用户输入
        Scanner scanner = new Scanner(System.in);

        // 开始循环购物，直到用户选择退出
        do {
            // 显示菜单供用户选择
            supermarket.manu();
            // 接收用户选择
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    // 购买商品
                    supermarket.shopAtSupermarket();
                    // 判断是否继续购物
                    if (total == 0){
                        System.out.print("是否继续逛超市?(y/n)");
                        // 根据用户意愿更新循环标志
                        if (!scanner.next().equalsIgnoreCase("y")) {
                            loop = false;
                            break;
                        }
                    }else {
                        break;
                    }
                case 2:
                    // 进行支付
                    supermarket.pay();
                    System.out.print("是否继续逛超市?(y/n)");
                    // 根据用户意愿更新循环标志
                    if (!scanner.next().equalsIgnoreCase("y")) {
                        loop = false;
                    }
                    // 判断是否完成支付并结束购物
                    if (total == 0){
                        break;
                    }
                case 3:
                    // 显示抽奖界面
                    System.out.println("*********欢迎参与抽奖*************");
                    if (total >= 50.0 && supermarket.isPaid){
                        System.out.println("*                              *");
                        System.out.println("*        您有一次抽奖机会         *");
                        System.out.println("*                              *");
                        System.out.println("*           正在抽奖中           *");
                        System.out.println("*                              *");
                        System.out.println("*********很遗憾,没有抽中**********\n");
                    }else {
                        // 显示无法抽奖的信息
                        System.out.println("抱歉，您没有抽奖机会\n");
                    }
                    // 重置支付状态，准备下次抽奖
                    supermarket.isPaid = false;
                    break;
                default:
                    // 对无效选择的处理
                    if (total == 0){
                        loop = false;
                    }else
                        System.out.println("请前往收银界面");
            }
        } while (loop);
        // 重置购物总额，准备新购物之旅
        total = 0.0;
        // 退出超市
        supermarket.exit();
    }
    /**
     * 展示超市商品列表
     * 该方法不接受参数，也不返回任何值。
     */
    public void showProducts() {
        // 打印商品列表标题
        System.out.println("*********超市商品列表*************");
        // 遍历数组，打印每个商品的编号、名称和价格
        for (int i = 0; i < ProductManager.productList.size(); i++) {
            System.out.println((i + 1) + ". " + ProductManager.productList.get(i).getName() + "\t￥ " + ProductManager.productList.get(i).getPrice());
        }
    }
    public void show(){
        System.out.println("*********欢迎光临*************");
    }
    public void manu() {
        System.out.println("1. 购买商品");
        System.out.println("2. 收银结账");
        System.out.println("3. 幸运抽奖");
        System.out.println("4. 离开超市");
        System.out.print("************请选择************");
    }
    public void exit() {
        System.out.println("*********欢迎再次光临*************");
    }
    /**
     * 在超市购物的模拟操作。
     * 该方法不接受参数，也没有返回值。
     */
    public void shopAtSupermarket() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // 显示可用的商品列表
            showProducts();
            System.out.print("请选择商品:");
            int choice = scanner.nextInt();

            // 输入购买数量
            System.out.print("请输入购买数量(斤):");
            double num = scanner.nextDouble();
            // 根据选择获取商品名称和价格
            String name = ProductManager.productList.get(choice - 1).getName();
            double price = ProductManager.productList.get(choice - 1).getPrice();
            // 计算商品总价
            double add = num * price;
            System.out.printf("商品: %s 单价: %.2f 数量: %.2f斤 总价: ￥%.2f\n",name , price, num, add);
            total += add; // 更新总金额

            // 询问用户是否继续购物
            System.out.print("是否继续挑选商品?(y/n)");
            String input = scanner.next();
            if (!input.equalsIgnoreCase("y")) {
                // 如果用户选择不继续，显示购物车总价并退出购物环节
                System.out.printf("您购买的所有商品总价为: ￥%.2f\n请前往收银界面 \n" , total);
                return;
            }
        }
    }


    /**
     * 进行支付操作。
     * 该方法会提示用户选择支付方式，并尝试进行支付，直到支付成功或用户选择放弃。
     * 支付方式包括：微信支付/支付宝、信用卡、账户余额和找零。
     * 该方法不接受任何参数，也没有返回值。
     */
    public void pay() {
        if (total != 0){ // 当商品总价不为0时，开始支付流程
            while (true) { // 进入循环，持续提示用户选择支付方式，直到支付成功或放弃
                System.out.printf("您购买的所有商品总价为: %.2f\n" , total); // 显示商品总价
                System.out.print("请选择支付方式: \n1. WeChatPay/Alipay\t2. credit card\n3. account balance\t4. change\n");
                Scanner scanner = new Scanner(System.in); // 创建Scanner对象用于读取用户输入
                int choice = scanner.nextInt(); // 读取用户选择的支付方式
                switch (choice) { // 根据用户选择的支付方式进行不同的操作
                    case 1:
                        System.out.println("您选择的支付方式是: WeChatPay/Alipay");
                        isPaid = digitalPay(); // 调用数字支付方法
                        return; // 如果支付成功，则结束方法
                    case 2:
                        System.out.println("您选择的支付方式是: credit card");
                        isPaid = creditCardPay(); // 调用信用卡支付方法
                        return; // 如果支付成功，则结束方法
                    case 3:
                        System.out.println("您选择的支付方式是: account balance");
                        accountBalancePay(); // 调用账户余额支付方法
                        continue; // 不论支付是否成功，继续提示用户选择支付方式
                    case 4:
                        System.out.println("您选择的支付方式是: change");
                        isPaid = changePay(); // 调用找零支付方法
                        if (isPaid){
                            return; // 如果支付成功，则结束方法
                        }else {
                            continue; // 如果支付失败，则继续提示用户选择支付方式
                        }
                    default:
                        System.out.println("输入错误, 请重新输入"); // 如果用户输入了无效的支付方式，提示错误并继续循环
                }
            }
        }else System.out.println("您无需支付"); // 如果商品总价为0，则直接提示用户无需支付
    }
    /**
     * 执行数字支付操作
     * 该方法无参数要求，执行过程中会打印出支付相关的提示信息，并在支付成功后返回true。
     *
     * @return boolean 返回支付是否成功。在当前实现中，总是返回true表示支付成功。
     */
    public boolean digitalPay() {
        // 打印提示信息，要求用户出示二维码进行支付
        System.out.println("请出示你的二维码");
        // 打印装饰图案，模拟支付界面的显示
        System.out.println("————————————————————");
        System.out.println("|                 |");
        System.out.println("|                 |");
        System.out.println("|                 |");
        System.out.println("|                 |");
        System.out.println("|                 |");
        System.out.println("————————————————————");
        // 打印支付成功的信息
        System.out.println("！！！！支付成功！！！！\n");
        return true;
    }
    /**
     * 信用卡支付方法
     * 本方法用于模拟信用卡支付过程，要求用户输入六位数密码进行验证。
     * 若用户输入的密码长度正确，则视为支付成功；否则提示错误并要求重新输入。
     *
     * @return boolean 返回支付是否成功。若支付成功，返回true；否则循环要求用户重新输入密码。
     */
    public boolean creditCardPay() {
        System.out.println("*************请刷卡***********");
        while (true) {
            Scanner scanner = new Scanner(System.in);  // 创建Scanner对象用于读取用户输入
            System.out.print("请输入六位数密码: ");
            String password = scanner.next();  // 获取用户输入的密码
            if (password.length() == 6) {  // 检查密码长度是否为6位
                System.out.println("刷卡成功");
                return true;  // 密码长度正确，支付成功，退出方法
            } else {
                System.out.println("输入错误,请重新输入");  // 密码长度错误，提示用户并要求重新输入
            }
        }
    }
    /**
     * 账户余额支付方法。
     * 该方法目前处于维护状态，调用时会提示用户更换支付方式。
     *
     */
    public void accountBalancePay() {
        // 提示用户系统正在维护，建议使用其他支付方式
        System.out.println("系统正在维护，请更换支付方式");
    }
    /**
     * 修改支付方式的函数
     * 该函数无参数。
     * @return boolean 返回值为true表示支付成功，返回值为false表示支付失败（金额不足）。
     */
    public boolean changePay() {
        Scanner scanner = new Scanner(System.in); // 使用Scanner从标准输入读取数据
        System.out.print("请支付: "); // 提示用户输入支付金额
        double change = scanner.nextDouble(); // 读取用户输入的支付金额
        System.out.println("已收取人民币: " + change); // 打印出收取的金额
        if (change >= total) { // 判断支付金额是否大于等于应付金额
            System.out.println("找零: " + (change - total)); // 如果支付金额大于应付金额，打印出找零金额
            System.out.println("谢谢惠顾"); // 打印出感谢语
            return true; // 返回true，表示支付成功
        } else {
            System.out.println("金额不足"); // 如果支付金额小于应付金额，打印出金额不足提示
            return false; // 返回false，表示支付失败
        }
    }
}

