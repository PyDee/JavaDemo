// 5
package javaStepInduction;

// 四则运算
public class Arithmetic05 {
    public void int_arithmetic() {
        // 整数的运算
        int i = (100 + 200) * (99 - 88); // 3300
        int n = 7 * (5 + (i - 9)); // 23072
        System.out.println(i);
        System.out.println(n);
    }

    public void overflow() {
        // 溢出
        // 整数由于存在范围限制，如果计算结果超出了范围，就会产生溢出，而溢出不会出错，却会得到一个奇怪的结果
        int x = 2147483640;
        int y = 15;
        int sum = x + y;
        System.out.println(sum); // -2147483641
    }

    public void auto_increment_attenuation() {
        // 自增-自减
        int n = 3300;
        n++; // 3301, 相当于 n = n + 1;
        n--; // 3300, 相当于 n = n - 1;
        int y = 100 + (++n); // 不要这么写
        System.out.println(y);
    }

    public void change_type() {
        // 强制类型转换
        int i = 111111111;
        System.out.println((short) i);
    }

    public static void main(String[] args) {
        var ari = new Arithmetic05();
        // ari.int_arithmetic();
        // ari.auto_increment_attenuation();
        ari.overflow();
//        ari.change_type();
    }
}

