// 16 类的继承
package javaStepInduction;

public class ClassExtend16 {

}

class Student extends Person {
    // 当前变量可以在继承树内被访问
    // 如果是 public 全部可以访问
    // 如果是 private 则只有当前类内可以访问
    public int scrod;

    public void setScrod(int scrod) {
        this.scrod = scrod;
    }

    public int getScrod() {
        return this.scrod;
    }

}