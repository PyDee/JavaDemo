/*
break 跳出带标签的循环
continue 当符合条件时，跳出当前label的大循环
带标签的 break continue
 */
package blbl;

public class lableBreakTest {
    public static void main(String[] args) {
        label:
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i * j);
                if (i * j == 25) {
//                    break label;
                    continue label;
                }
            }
        }
    }
}
