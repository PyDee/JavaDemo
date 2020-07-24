// 2
package javaStepInduction;

// 对于float类型，需要加上f后缀。
// 浮点数可表示的范围非常大，float类型可最大表示3.4x1038，而double类型可最大表示1.79x10308。
public class InitFloat02 {
	public static void main(String[] args) {
		float f1 = 3.14f;
		System.out.println(f1);
		float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
		System.out.println(f2);
		double d = 1.79e308;
		System.out.println(d);
		double d2 = -1.79e308;
		System.out.println(d2);
		double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
		System.out.println(d3);
	}
}