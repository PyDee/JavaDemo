package blbl;

import java.lang.Math;

public class ternaryOperatorTest {
    /*
     * 三元运算符
     */
    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        int t = n * 3;
        System.out.println(t);
        double s = Math.pow(t, m);
        System.out.println(s);
        int max = (s > t) ? m : n;
        System.out.println(max);

        System.out.println(7 % 4);
    }
}
