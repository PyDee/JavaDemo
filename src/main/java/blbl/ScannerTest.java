package blbl;
/*
1. 导包： import java.util.Scanner; // 获取键盘的输入
2. Scanner 的实例化，Scanner scan = new Scanner（）
 */

import java.util.Scanner; // 获取键盘的输入


public class ScannerTest {
    public static void main(String[] args) {
        System.out.println("此处需要输入 int 数据：");
        Scanner scan = new Scanner(System.in);
        // String 类型
        String str = scan.next();
        System.out.println(str);
        // Double 类型
        double d = scan.nextDouble();
        // scanner 并没有提供 char 类型的输入，如果需要，则使用如下方式
        String gender = scan.next();
        char genderChar = gender.charAt(0);
        //
        //
        int num = scan.nextInt();
        System.out.println(num);

    }
}
