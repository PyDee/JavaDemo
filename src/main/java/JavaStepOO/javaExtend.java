// 1 面向对象-继承
package JavaStepOO;


public class javaExtend {
    // 子类不会继承父类的构造方法，需要显示的用super调用父类的带参构造方法
    public static void main(String[] args) {
        Dog dog = new Dog("狗子");
        String classify = dog.getClassify();
        System.out.println(classify);
        System.out.println(11111);
    }
}


class Dog extends SuperBiology {
    // 与类同名的方法是类的构造方法
    // 默认存在无参构造，当实现有参构造后，就没有无参构造了，子类需实现其构造方法，用super 调用
    // 所以实现有参构造时最后把无参构造也实现，避免出现错误

    public Dog(String classify) {
        super.setClassify(classify);
    }

}
