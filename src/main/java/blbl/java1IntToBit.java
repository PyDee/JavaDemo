/*
 *  哔哩哔哩视频跟学代码
 *  进制转换，将int 转换为 bit
 *  输出数据为 补码（所有数据以补码的形式存储在计算机中）
 */
package blbl;

public class java1IntToBit {

    public static String getBinaryValue(int n) {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 32; i++) {
            int t = (n & 0x80000000 >>> i) >>> (31 - i);
            result.append(t);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String result = java1IntToBit.getBinaryValue(-14);
        System.out.println(result);
    }
}
