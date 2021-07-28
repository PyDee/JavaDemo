// 查看ArrayList的源码
package javaGenericity;

import java.util.ArrayList;
import java.util.Arrays;

public class javaSelfArrayList {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
        Integer[] arr = new Integer[]{2, 3333, 434324, 5234543, 663};
        Arrays.sort(arr);
        ArrayList<String> str_arr = new ArrayList<String>();
        str_arr.add("hello");
        System.out.println(str_arr);
        System.out.println(arr);

    }
}
