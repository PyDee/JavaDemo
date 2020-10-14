// stringbuilder 是一个用来处理多个字符串拼接的类
package src.main.java.javaException;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class catchException {
    public static void main(String[] args) {
        double x = Math.abs(-123.45);
        assert 1 < 0;
//        System.out.println(x);
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    static byte[] toGBK(String s) {
        try {
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            System.out.println(e); // 打印异常信息
            return s.getBytes();
        }
    }

    //     使用throws 表示方法可能会抛出的错误
    static byte[] toDBKTest(String s) throws UnsupportedEncodingException {
        return s.getBytes("GBK");
    }
}