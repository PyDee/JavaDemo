// 7
package javaStepInduction;

import java.util.Scanner;

public class GetInput07 {

    public void print_many_elements() {
        // 同时输出多种数据类型的数据
        int a = 1;
        char b = 'b';
        String str = "sss";
        System.out.printf("Print:%d, %s, %s\n", a, b, str);
    }

    public void use_other_method() {
        // 使用this 调用类内其他方法
        this.print_many_elements();
    }

    // 获取窗口输入
    public static void main(String[] args) {
        GetInput07 gi = new GetInput07();
        gi.use_other_method();
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
    }
}