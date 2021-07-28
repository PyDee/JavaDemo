/*
java 运算符
 */
package blbl;

public class java2Operation {
    public static void main(String[] args) {
        // 除法 ： /
        int num = 4;
        int num1 = 2;
        int num2 = 5;
        System.out.println(num / num1);

        // 取模 ： %
        // 取余运算 ： 一般用来判断是否可以被除尽 ，最终结果为 ： 0 表示可以被除尽
        System.out.println(num % num2);

        // 自加自减运算
        // （前）++  : 先自增1， 后运算
        // （后）++  ：先运算， 后自增1
        // 自加运算并不会改变变量本身的数据类型
        int a1 = 10;
        // int b1 = ++a1;
        int b2 = a1++;
        System.out.println("a1 :" + a1 + "   b2  " + b2);

        // （前）--： 先自减1， 后运算
        // （后）--： 先运算， 后自减1
        int c1 = 34;
        int d1 = c1--;
        System.out.println(c1 + "         " + d1);

    }
}
