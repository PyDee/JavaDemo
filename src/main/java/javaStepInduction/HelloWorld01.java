// 1
package javaStepInduction;

public class HelloWorld01 {

    public void printHello() {
        // 实现一个控制台输出方法
        System.out.println("printHello:" + "Hello");
    }

    public void initIntegerVariable() {
        // 定义整型变量
        int x = 1;
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L
        System.out.println("x:" + x);
        System.out.println("i:" + i);
        System.out.println("i2:" + i2);
        System.out.println("i3:" + i3);
        System.out.println("i4:" + i4);
        System.out.println("i5:" + i5);
        System.out.println("l:" + l);
    }

    public static void main(String[] args) {
        /* 测试类内调用 */
        HelloWorld01 hw = new HelloWorld01();
        hw.printHello();
        hw.initIntegerVariable();
        System.out.println("main:" + "Hello World");

    }
}