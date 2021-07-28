package blbl;

public class whileTest {
    public static void main(String[] args) {
        //  执行过程 ① - ② - ③ - ④ - ② - ③ - ④ - …… - ② - ③ - ④
        //       ①
        int num = 1;

        while (num < 100) {

            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
