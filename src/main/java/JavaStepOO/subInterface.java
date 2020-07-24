// 5. （继承） 实现接口
package JavaStepOO;

// 类继承接口，需要实现所有方法
public class subInterface implements javaInterface {
    static String classify;

    @Override
    public void run() {

    }

    @Override
    public void eat() {
        filed_print();

    }

    protected static void subPrint() {
        classify = "555";
        System.out.println(classify);
    }

    public static void main(String[] args) {
        subInterface si = new subInterface();
        si.eat();
        classify = "44444";
        System.out.println(classify);
        subPrint();
    }

}

// 接口继承接口 相当于类继承类，使用extends
interface secondSub extends javaInterface {
    void move();
}