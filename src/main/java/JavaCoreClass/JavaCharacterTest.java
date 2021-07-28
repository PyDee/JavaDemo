package JavaCoreClass;

public class JavaCharacterTest {
    public static void main(String[] args) {
        test(args);
    }

    public static void test(String[] args) {
        char ch = 'a';
        // Unicode 字符表示形式
        char uniChar = '\u039A';
        // 字符数组
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};

        // 使用包装类,java5.0 之后自动装箱
        Character c = 'b';

        System.out.println(charArray);
        System.out.println("c:" + c.toString());
        System.out.println(ch);
    }
}
