package JavaCoreClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class JavaDateTest {
    public static void main(String[] args) {
//        javaSleep();
        runSpentTime();
        System.exit(100);
        Date date = new Date();
        whichDay(date);
        formatDate(date);
        printfFormatDate(date);
    }


    // 输出标准格式的日期：Tue Jul 27 16:22:23 CST 2021
    // CST 中国，古巴，美国等标准时间
    // GMT 格林威治时间
    public static void stdDate() {
        Date date = new Date();
        System.out.println(date.toString());
    }

    // 今天星期几？
    public static String whichDay(Date date) {
        String[] weekDays = {"SunDay", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int wd = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (wd < 0) wd = 0;
        System.out.println("[今天星期几]----->" + weekDays[wd]);
        return weekDays[wd];
    }

    // java 实现睡眠操作
    public static void javaSleep() {
        try {
            System.out.println("[标准格式日期]----->" + new Date() + "\n");
            Thread.sleep(3000);// 休眠 3 秒
            System.out.println("[标准格式日期]----->" + new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }

    // java 计算程序运行耗时
    public static void runSpentTime() {
        try {
            long start = System.currentTimeMillis();
            System.out.printf("[标准格式日期]----->   %d " + new Date() + "\n", start);
            Thread.sleep(3000);
            long end = System.currentTimeMillis();
            System.out.printf("[标准格式日期]----->   %d " + new Date() + "\n", end);
            long spent = end - start;
            System.out.printf("[睡眠耗时]----->  %d ", spent);
        } catch (Exception e) {
            System.out.println("Got an Exception@");
        }
    }

    // 格式化日期 ： HH 是 24 小时制，而 hh 是 12 小时制。
    public static void formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("[格式化日期-当前时间为]----> " + sdf.format(date));
    }


    // 定义日期格式的转换符可以使日期通过指定的转换符生成新字符串。这些日期转换符如下所示：
    public static void formatDateStr() {
        Date date = new Date();
        //b的使用，月份简称
        String str = String.format(Locale.US, "英文月份简称：%tb", date);
        System.out.println(str);
        System.out.printf("本地月份简称：%tb%n", date);
        //B的使用，月份全称
        str = String.format(Locale.US, "英文月份全称：%tB", date);
        System.out.println(str);
        System.out.printf("本地月份全称：%tB%n", date);
        //a的使用，星期简称
        str = String.format(Locale.US, "英文星期的简称：%ta", date);
        System.out.println(str);
        //A的使用，星期全称
        System.out.printf("本地星期的简称：%tA%n", date);
        //C的使用，年前两位
        System.out.printf("年的前两位数字（不足两位前面补0）：%tC%n", date);
        //y的使用，年后两位
        System.out.printf("年的后两位数字（不足两位前面补0）：%ty%n", date);
        //j的使用，一年的天数
        System.out.printf("一年中的天数（即年的第几天）：%tj%n", date);
        //m的使用，月份
        System.out.printf("两位数字的月份（不足两位前面补0）：%tm%n", date);
        //d的使用，日（二位，不够补零）
        System.out.printf("两位数字的日（不足两位前面补0）：%td%n", date);
        //e的使用，日（一位不补零）
        System.out.printf("月份的日（前面不补0）：%te", date);
    }

    //printf 格式化日期例子:printf 方法可以很轻松地格式化时间和日期。使用两个字母格式，它以 %t 开头并且以下面表格中的一个字母结尾。
    /*
    %b 布尔值 true or false
    %d 十进制整数 200
    %o 八进制整数
    %x 十六进制整数
    %f 浮点数 45.460000
    %e 标准科学计数法形式的数 4.556000e+01
    %c 字符 ‘a’
    %s 字符串 “Java is cool”
    %t 日期类型
     */
    public static void printfFormatDate(Date date) {
        //c的使用:星期六 十月 27 14:21:20 CST 2007
        System.out.printf("全部日期和时间信息：%tc%n", date);
        //f的使用:2007-10-27
        System.out.printf("年-月-日格式：%tF%n", date);
        //d的使用:10/27/07
        System.out.printf("月/日/年格式：%tD%n", date);
        //r的使用:02:25:51 下午
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
        //t的使用:14:28:16
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date);
        //R的使用:14:28
        System.out.printf("HH:MM格式（24时制）：%tR", date);
    }

    // printf 格式化例子
    public static void printfFormatEg() {
        /* 输出字符串 ***/
        // %s表示输出字符串，也就是将后面的字符串替换模式中的%s
        System.out.printf("%s", new Integer(1212));
        // %n表示换行
        System.out.printf("%s%n", "end line");
        // 还可以支持多个参数
        System.out.printf("%s = %s%n", "Name", "Zhangsan");
        // %S将字符串以大写形式输出
        System.out.printf("%S = %s%n", "Name", "Zhangsan");
        // 支持多个参数时，可以在%s之间插入变量编号，1$表示第一个字符串，3$表示第3个字符串
        System.out.printf("%1$s = %3$s %2$s%n", "Name", "san", "Zhang");

        /* 输出boolean类型 ***/
        System.out.printf("true = %b; false = ", true);
        System.out.printf("%b%n", false);

        /* 输出整数类型***/
        Integer iObj = 342;
        // %d表示将整数格式化为10进制整数
        System.out.printf("%d; %d; %d%n", -500, 2343L, iObj);
        // %o表示将整数格式化为8进制整数
        System.out.printf("%o; %o; %o%n", -500, 2343L, iObj);
        // %x表示将整数格式化为16进制整数
        System.out.printf("%x; %x; %x%n", -500, 2343L, iObj);
        // %X表示将整数格式化为16进制整数，并且字母变成大写形式
        System.out.printf("%X; %X; %X%n", -500, 2343L, iObj);

        /* 输出浮点类型***/
        Double dObj = 45.6d;
        // %e表示以科学技术法输出浮点数
        System.out.printf("%e; %e; %e%n", -756.403f, 7464.232641d, dObj);
        // %E表示以科学技术法输出浮点数，并且为大写形式
        System.out.printf("%E; %E; %E%n", -756.403f, 7464.232641d, dObj);
        // %f表示以十进制格式化输出浮点数
        System.out.printf("%f; %f; %f%n", -756.403f, 7464.232641d, dObj);
        // 还可以限制小数点后的位数
        System.out.printf("%.1f; %.3f; %f%n", -756.403f, 7464.232641d, dObj);

        /* 输出日期类型***/
        // %t表示格式化日期时间类型，%T是时间日期的大写形式，在%t之后用特定的字母表示不同的输出格式
        Date date = new Date();
        long dataL = date.getTime();
        // 格式化年月日
        // %t之后用y表示输出日期的年份（2位数的年，如99）
        // %t之后用m表示输出日期的月份，%t之后用d表示输出日期的日号
        System.out.printf("%1$ty-%1$tm-%1$td; %2$ty-%2$tm-%2$td%n", date, dataL);
        // %t之后用Y表示输出日期的年份（4位数的年），
        // %t之后用B表示输出日期的月份的完整名， %t之后用b表示输出日期的月份的简称
        System.out.printf("%1$tY-%1$tB-%1$td; %2$tY-%2$tb-%2$td%n", date, dataL);

        // 以下是常见的日期组合
        // %t之后用D表示以 "%tm/%td/%ty"格式化日期
        System.out.printf("%1$tD%n", date);
        //%t之后用F表示以"%tY-%tm-%td"格式化日期
        System.out.printf("%1$tF%n", date);

        /* 输出时间类型***/
        // 输出时分秒
        // %t之后用H表示输出时间的时（24进制），%t之后用I表示输出时间的时（12进制），
        // %t之后用M表示输出时间的分，%t之后用S表示输出时间的秒
        System.out.printf("%1$tH:%1$tM:%1$tS; %2$tI:%2$tM:%2$tS%n", date, dataL);
        // %t之后用L表示输出时间的秒中的毫秒
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tL%n", date);
        // %t之后p表示输出时间的上午或下午信息
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tL %1$tp%n", date);

        // 以下是常见的时间组合
        // %t之后用R表示以"%tH:%tM"格式化时间
        System.out.printf("%1$tR%n", date);
        // %t之后用T表示以"%tH:%tM:%tS"格式化时间
        System.out.printf("%1$tT%n", date);
        // %t之后用r表示以"%tI:%tM:%tS %Tp"格式化时间
        System.out.printf("%1$tr%n", date);

        /* 输出星期***/
        // %t之后用A表示得到星期几的全称
        System.out.printf("%1$tF %1$tA%n", date);
        // %t之后用a表示得到星期几的简称
        System.out.printf("%1$tF %1$ta%n", date);

        // 输出时间日期的完整信息
        System.out.printf("%1$tc%n", date);
    }
}
