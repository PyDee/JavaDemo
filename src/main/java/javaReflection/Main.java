// 反射
// Java的反射是指程序在运行期可以拿到一个对象的所有信息
// 反射是为了解决在运行期，对某个实例一无所知的情况下，如何调用其方法,没有导入该类
package javaReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws Exception {
        Class stdClass = Student.class;
        // 获取public字段"score":
        System.out.println(stdClass.getField("score"));
        // 获取继承的public字段"name":
        System.out.println(stdClass.getField("name"));
        // 获取private字段"grade":
        System.out.println(stdClass.getDeclaredField("grade"));


        Field f = String.class.getDeclaredField("value");
        System.out.println(f.getName()); // "value"
        System.out.println(f.getType()); // class [B 表示byte[]类型
        int m = f.getModifiers();
        System.out.println(Modifier.isFinal(m)); // true
        System.out.println(Modifier.isPublic(m)); // false
        System.out.println(Modifier.isProtected(m)); // false
        System.out.println(Modifier.isPrivate(m)); // true
        System.out.println(Modifier.isStatic(m)); // false


        // 非0number/0.0
        System.out.println((double)(5/0.0));

        // 0/0.0
        System.out.println((double)(0/0.0));

        // 0.0/0.0
        System.out.println((double)(0.0/0.0));

        // MAX_VALUE/MIN_VALUE
        System.out.println((double)(Double.MAX_VALUE/Double.MIN_VALUE));


    }
}

class Student extends Person {
    public int score;
    private int grade;
}

class Person {
    public String name;
}
