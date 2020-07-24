// 5. 定义接口
package JavaStepOO;

// 虽然可以定义属性，但是方法无法调用属性
// default 关键字标识的方法，可以调用属性
public interface javaInterface {
    String name = "111";

    void run();


    void eat();

    default void filed_print() {
        System.out.println(name);
    }
}
