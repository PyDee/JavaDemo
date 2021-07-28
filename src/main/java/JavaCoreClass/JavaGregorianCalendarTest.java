package JavaCoreClass;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar类实现了公历日历，GregorianCalendar是Calendar类的一个具体实现。
 * Calendar 的getInstance（）方法返回一个默认用当前的语言环境和时区初始化的GregorianCalendar对象。
 * GregorianCalendar定义了两个字段：AD和BC。这是代表公历定义的两个时代。
 */
public class JavaGregorianCalendarTest {
    public static void main(String[] args) {
        String[] months = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};

        int year = 0;
        GregorianCalendar gCalender_obj = new GregorianCalendar();
        printInfo(gCalender_obj, months, year);
        isLeapYear(gCalender_obj, 1904);
    }

    // 打印 日期时间
    public static void printInfo(GregorianCalendar gregorianCalendar, String[] months, int year) {
        System.out.print("Date: ");
        System.out.print(months[gregorianCalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gregorianCalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gregorianCalendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gregorianCalendar.get(Calendar.HOUR) + ":");
        System.out.print(gregorianCalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gregorianCalendar.get(Calendar.SECOND));
    }

    // 判断是否是闰年
    public static void isLeapYear(GregorianCalendar gregorianCalendar, int year) {
        boolean flag = gregorianCalendar.isLeapYear(year);
        if (flag) {
            System.out.println("当前年份是闰年");
        } else {
            System.out.println("当前年份不是闰年");
        }

    }
}
