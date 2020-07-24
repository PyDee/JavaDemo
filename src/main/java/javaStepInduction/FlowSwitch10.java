// 10
package javaStepInduction;

import java.util.Scanner;

public class FlowSwitch10 {
    public static void main(String[] args) {
        // 当漏写  break 时 会执行多有case，所有不能忘记写break
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的选择：1 or 2 or 3");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
            case 4:
                // 多个选择返回同一结果可如以上方式填写
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("当前您没有做选择，系统自动添加选择项");
        }
    }
}

