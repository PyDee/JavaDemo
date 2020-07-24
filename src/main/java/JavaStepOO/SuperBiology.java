package JavaStepOO;

class SuperBiology {
    protected String classify;
    int a = 1;
    Integer s = 5;

    public SuperBiology() {

    }

    protected void setClassify(String classify) {
        this.classify = classify;
    }

    protected String getClassify() {
        return this.classify;
    }

    public static void main(String[] args) {
        System.out.println(111);
    }
}

interface Cat {
    // 接口中所有属性都是类属性，接口不能被实例化，不存在实例属性，
    // 所有的属性都被static 描述，所以都是类属性
    public final static String color = "white";

    void eat();
}

abstract class XianLuo {
    char color = 'w';

    public abstract void eat();

    public abstract void run();

}

