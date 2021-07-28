package JavaCoreClass;

import java.util.Calendar;

/**
 * Calendar类实现了公历日历
 */
public class JavaCalendarTest {
    public static void main(String[] args) {
        Calendar calender_obj = init();
        setInfo(calender_obj, 2021, 5, 20);
        addDate(calender_obj, 380);
        addMonth(calender_obj, 5);
        addYear(calender_obj, 25);
        getInfo(calender_obj);
    }

    // 初始化一个 Calendar 对象
    public static Calendar init() {
        // Calendar类是一个抽象类
        // 在实际使用时实现特定的子类的对象，创建对象的过程对程序员来说是透明的，只需要使用getInstance方法创建即可。
        // 创建: Calendar calendar_obj = Calendar.getInstance();
        return Calendar.getInstance();
    }

    // 设置 Calendar 对象的相关信息
    public static void setInfo(Calendar calendar_obj, int year, int month, int date) {
        calendar_obj.set(year, month, date);
    }

    // 获取 Calendar 对象的相关信息
    public static void getInfo(Calendar calendar_obj) {
        System.out.println("[年份]----->" + calendar_obj.get(Calendar.YEAR));
        System.out.println("[月份]----->" + calendar_obj.get(Calendar.MONTH));
        System.out.println("[日期]----->" + calendar_obj.get(Calendar.DATE));
        System.out.println("[12制小时]----->" + calendar_obj.get(Calendar.HOUR));
        System.out.println("[分钟]----->" + calendar_obj.get(Calendar.MINUTE));
        System.out.println("[秒]----->" + calendar_obj.get(Calendar.SECOND));
    }

    // 关于 Calendar 对象的计算,日期加 10 天
    public static void addDate(Calendar calendar_obj, int add_num) {
        calendar_obj.add(Calendar.DATE, add_num);
    }

    // 关于 Calendar 对象的计算,月份加 10 月
    public static void addMonth(Calendar calendar_obj, int add_num) {
        calendar_obj.add(Calendar.MONTH, add_num);
    }

    // 关于 Calendar 对象的计算,年份加 10 年
    public static void addYear(Calendar calendar_obj, int add_num) {
        calendar_obj.add(Calendar.YEAR, add_num);
    }

    // 关于 Calendar 对象的计算,hour加 10 小时
    public static void addHour(Calendar calendar_obj, int add_num) {
        calendar_obj.add(Calendar.HOUR, add_num);
    }
}
