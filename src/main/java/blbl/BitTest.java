package blbl;

public class BitTest {
    public static void main(String[] args) {
//        testLeft();
//        changeNum();
//        changeNumAddWay();
        changeNumBit();
    }

    public static void testLeft() {
        int i = 453514351;
        System.out.println("i << 2 :" + (i << 2));
        System.out.println("i << 3 :" + (i << 3));
        // 当移动到这一位时，最高位为 1 ，则输出为 负数
        System.out.println("i << 27 :" + (i << 27));

    }

    public static void changeNum() {
        /*
        数值交换
         */
        int num1 = 3;
        int num2 = 4;

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1: " + num1 + "   num2: " + num2);
    }

    public static void changeNumAddWay() {
        /*
        好处： 不需要临时变量
        坏处： 超出变量的存储范围 ， 仅限数值型交换，不具有通用性
         */
        int num1 = 3;
        int num2 = 4;
        num1 = num2 + num1;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1: " + num1 + "   num2: " + num2);


    }

    public static void changeNumBit() {
        /*
        使用位运算符,仅适用于数值类型
         */
        int num1 = 3;
        int num2 = 4;

        num1 = num2 ^ num1;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("num1: " + num1 + "   num2: " + num2);


    }
}
