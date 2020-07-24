// 8 逻辑运算
package javaStepInduction;

import java.util.Scanner;

class Data {
    // 返回多个不同类型的值
    int a;
    char b;

}

// 逻辑运算
public class LogicOperation08 {
    public Data get_input() {
        Scanner input = new Scanner(System.in);
        String id = input.next();
        int age = input.nextInt();
        char sex = input.next().charAt(0);
        System.out.println(id);
        System.out.println(age);
        System.out.println(sex);
        Data data = new Data();
        data.a = age;
        data.b = sex;
        return data;

    }

    public static void main(String[] args) {
        var lo = new LogicOperation08();
        Data data = lo.get_input();
        boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0);
        System.out.println(result);
    }
}
