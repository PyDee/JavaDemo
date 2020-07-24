// 14 排序算法
package javaStepInduction;

import java.util.Arrays;

public class SortArithmetic14 {
    private void DefaultSort(int[] values) {
        //  Arrays 默认排序实现
        // 如果对一个字符串数组进行排序，原来的3个字符串在内存中均没有任何变化，但是ns数组的每个元素指向变化了
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
    }

    public void BubbleSort(int[] values) {
        // 冒泡排序
        int temp;
        for (int k = 0; k < values.length - 1; k++) {
            for (int j = 0; j < values.length - k - 1; j++) {
                if (values[j + 1] < values[j]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] ns = {4, 6565, 343, 324, 66, 2, 663, 34134, 6435};
        SortArithmetic14 sa = new SortArithmetic14();
        sa.BubbleSort(ns);
        System.out.println(Arrays.toString(ns));

    }
}
