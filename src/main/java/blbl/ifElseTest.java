package blbl;

import java.util.Scanner;

public class ifElseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入a");
        int a = scan.nextInt();
        System.out.println("请输入b");
        int b = scan.nextInt();
        // 三元运算符
        int is_big = ((a / b) > b) ? a : b;
        System.out.println(is_big);

    }
}
