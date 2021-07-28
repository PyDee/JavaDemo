package JavaCoreClass;

import java.util.Arrays;

public class JavaArrayTest {
    public static void main(String[] args) {
        int[] scores = {89, -23, 64, 91, 119, 52, 73};
        enumPrintArray(scores);
    }

    // 声明
    public static void declareAnArray() {
        /*
        声明一个数组
         */
        String[] names; // 声明--> 首选方法
    }

    // 创建
    public static void createAnArray() {
        int[] scores = new int[5]; // 创建
    }

    // 创建 & 赋值
    public static void create$InitAnArray() {
        String[] names = {"bob", "amy"};
    }

    // 遍历打印数组 & 数组作为函数参数
    public static void enumPrintArray(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }

    // 打印整个数组
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}


/*
操作数组的工具类
 */
class ArraysTest {

}