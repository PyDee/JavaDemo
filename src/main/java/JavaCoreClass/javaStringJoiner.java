package src.main.java.JavaCoreClass;

import java.util.StringJoiner;
import java.lang.Integer;

public class javaStringJoiner {
    public static void main(String[] args) {
        String[] names = {"Bob", "Jone", "Alice"};
        String ori_str = String.join(",", names);

        var sj = new StringJoiner(",", "hello ", "!");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println("sj:" + sj);
        System.out.println("ori_str:" + ori_str);
        System.out.println(111111111);
        short t = -30;
        System.out.println(Short.toUnsignedInt(t));
    }
}