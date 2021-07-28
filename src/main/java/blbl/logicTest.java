package blbl;

public class logicTest {


    /**
     * @param args:None
     * @deprecated : 逻辑运算测试
     */
    public static void main(String[] args) {
        boolean b1 = true;
        byte num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("1111111111");
        } else {
            System.out.println("222222222");
        }
        System.out.println(num1);

        boolean b2 = true;
        b2 = false;
        byte num2 = 10;
//        if ((num2++ > 0) && b2) {
        if (b2 && (num2++ > 0)) {
            System.out.println("33333333333");
        } else {
            System.out.println("4444444444");
        }
        System.out.println(num2);
    }
}
