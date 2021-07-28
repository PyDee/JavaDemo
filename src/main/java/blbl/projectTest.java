package blbl;

import java.util.Scanner;

public class projectTest {

    public static void main(String[] args) {
        home_menu();
    }


    public static void home_menu() {
        boolean flag = true;
        String detail = "收支\t账户金额\t收支金额\t说明";
        int balance = 10000;
        while (flag) {

            System.out.println("-------------------------记账-------------------------");
            System.out.println("                        1 明细                        ");
            System.out.println("                        2 收入                        ");
            System.out.println("                        3 支出                        ");
            System.out.println("                        4 退出                        ");
            System.out.println("请输入你的选择：");
            Scanner scan = new Scanner(System.in);
            String selector = scan.next();
            switch (selector) {
                case "1":
                    show_list(detail);
                    break;
                case "2":
                    System.out.println("请输入收入金额:");
                    int income_cash = scan.nextInt();
                    System.out.println("请输入收入说明:");
                    String income_dec = scan.next();
                    balance = balance + income_cash;
                    detail += "\n收入\t" + balance + "\t" + income_cash + "\t" + income_dec;
                    break;
                case "3":
                    System.out.println("请输入支出金额:");
                    int out_cash = scan.nextInt();
                    System.out.println("请输入支出说明:");
                    String out_dec = scan.next();
                    if (balance - out_cash < 0) {
                        System.out.println("支出不允许");
                        System.out.println("当前清单：");
                        show_list(detail);
                    } else {
                        balance = balance - out_cash;
                        detail += "\n支出\t" + balance + "\t" + out_cash + "\t" + out_dec;
                    }
                    break;
                case "4":
                    System.out.println(4);
                    flag = false;
                    break;
                default:
                    System.out.println("输入错误！");
            }
        }
    }

    public static void show_list(String args) {
        System.out.println(args);
        System.out.println("-----------------------------------------------------");

    }

}
