package JavaCoreClass;

import java.util.Arrays;

public class javaStringBuilder<day> {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 10; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        WeekDay day = WeekDay.Thursday;
        if (day == WeekDay.SunDay || day == WeekDay.Saturday) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
        int[] scores = {89, -23, 64, 91, 119, 52, 73};
        System.out.println(Arrays.toString(scores));

    }
}


enum WeekDay {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    SunDay,

}