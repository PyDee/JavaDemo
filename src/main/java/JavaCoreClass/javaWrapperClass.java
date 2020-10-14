// java 包装类型
// java 中的基本数据类型： byte  int  short  long  char  boolean  float  double
// java 中的引用数据类型： class  interface
// Integer 就是 int 的引用数据类型定义的类，基本数据类型都有其对应的引用实现
package src.main.java.JavaCoreClass;

import java.lang.Math;
import java.math.BigInteger;

import cn.hutool.core.date.Week;

public class javaWrapperClass {
    public static void main(String[] args) {
        WeekDay mon = WeekDay.MON;
        int i = 66666666;
        // Integer.valueOf() 属于静态工厂方法
        // 创建新对象时，优先选用静态工厂方法而不是new操作符
        Integer new_i = Integer.valueOf(i);
        System.out.println(getType(new_i));
        System.out.println(getType(i));
        System.out.println(mon.ordinal());
        testLong();
    }

    private static void testLong() {
        BigInteger l = BigInteger.valueOf(123456898);
        System.out.println(l.pow(50000000));
    }

    private static String getType(Object a) {
        return a.getClass().toString();

    }
}

enum WeekDay {
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT;
}

enum WeedDayWithValue {
    MON(1, "星期一"),
    TUE(2, "星期二"),
    WED(3, "星期三"),
    THU(4, "星期四"),
    FRI(5, "星期五"),
    SAT(6, "星期六"),
    SUN(0, "星期日");

    public final int dayValue;
    private final String chinese;

    private WeedDayWithValue(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }

}