// java 核心类-String
package src.main.java.JavaCoreClass;

import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Arrays;

public class javaString {
    //    实际上字符串在String内部是通过一个char[]数组表示的
    public String Flag = "FLY IN THE SKY              \t1111";
    String flag = new String(new char[]{'F', 'L', 'Y'});

    public void GetSystemProperties() {
        // 获取所有系统变量
        // Get all system properties
        Properties props = System.getProperties();

        // Enumerate all system properties
        Enumeration enum1 = props.propertyNames();
        for (; enum1.hasMoreElements(); ) {
            // Get property name
            String propName = (String) enum1.nextElement();
            // Get property value
            String propValue = (String) props.get(propName);
            System.out.println(propName + "-->" + propValue);
        }
    }

    public static String CharToString() {
        // char 转型为 String
        char[] testFiled = {'a', 'b', 'c'};
        int num = 1;
        return new String(testFiled);
    }

    public static void EncodingChange() throws UnsupportedEncodingException {
        byte[] b = "中".getBytes("GBK");
        System.out.println(b.length);

        String s1 = new String(b, "GBK");
        System.out.println(s1);
    }


    public static void main(String[] args) throws UnsupportedEncodingException {
        javaString js = new javaString();
        System.out.println(js.Flag.equals(js.flag)); // 比较 类似 == 返回值为 true
        System.out.println(js.Flag.contains("LL")); // 包含
        System.out.println(js.Flag.endsWith("lY"));
        System.out.println(js.Flag.startsWith("lY"));
        System.out.println(js.Flag.indexOf("Y"));
        System.out.println(js.Flag.substring(2, 5));// Y I
        System.out.println(js.Flag.trim()); //可以移除字符串首尾空白字符。空白字符包括空格，\t，\r，\n
        System.out.println(js.Flag.strip());// strip()方法也可以移除字符串首尾空白字符。它和trim()不同的是，类似中文的空格字符\u3000也会被移除
        System.out.println(js.Flag.replace("IN", "TO"));
//        js.GetSystemProperties();
//        System.out.println(CharToString());
        System.out.println("--------");
        EncodingChange();
    }

}
