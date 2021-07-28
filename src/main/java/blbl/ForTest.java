package blbl;

public class
ForTest {
    public static void main(String[] args) {
        //  执行过程 ① - ② - ③ - ④ - ② - ③ - ④ - …… - ② - ③ - ④
        //       ①      ②       ④
        for (int i = 1; i < 100; i++) {
            // ③
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
