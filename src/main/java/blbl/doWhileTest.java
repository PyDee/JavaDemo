package blbl;

public class doWhileTest {
    public static void main(String[] args) {
        // 执行过程 ① - ③ - ④ - ② - ③ - ④ - ② - ③ - ④ - …… - ② - ③ - ④
        // 初始化条件 ①
        int num = 1;
        do {
            // 循环体 ③
            if (num % 2 == 0) {
                System.out.println(num);
            }
            // 迭代条件 ④
            num++;

            // 循环条件 ②
        } while (num < 100);
    }
}

