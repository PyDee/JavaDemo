// 4 抽象类
// 由于子类（多态）都可以覆写父类方法，就有了抽象类
// 使用abstract修饰的类就是抽象类。我们无法实例化一个抽象类：
// 抽象方法实际上相当于定义了“规范”。
package JavaStepOO;

public abstract class javaAbstract {
    /**
     * 定义一个抽象类
     */
    public abstract void run();

    public abstract void eat();

}

