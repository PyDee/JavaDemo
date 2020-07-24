// 9
package javaStepInduction;

public class FlowIf09 {
    // if 流程语句
    public void judge() {
        double x = 1 - 9.0 / 10;
        if (Math.abs(x - 0.1) < 0.00001) {
            System.out.println("x is 0.1");
        } else {
            System.out.println("x is NOT 0.1");
        }
    }


    public static void main(String[] args) {
        FlowIf09 flow_if = new FlowIf09();
        flow_if.judge();
        int n = 50;
        if (n >= 60)
            System.out.println("及格了");
        else {
            System.out.println("没有及格呢");
        }
        System.out.println("恭喜你"); // 注意这条语句不是if语句块的一部分
        System.out.println("END");
    }
}
