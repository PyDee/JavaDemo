// 13
package javaStepInduction;

public class FlowFor13 {
    public void forList() {
        int[] ns = {1, 4, 9, 16, 25};
//        for 遍历
//        for (int i = 0; i < ns.length; i++) {
//        for each 遍历
        for (int k : ns) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        FlowFor13 ff = new FlowFor13();
        ff.forList();
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
