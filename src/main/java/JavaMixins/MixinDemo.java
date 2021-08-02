package JavaMixins;

import java.util.Collections;

/**
 * 多态实例
 */
public class MixinDemo {
    public static void main(String[] args) {
        show(new Cat());
        show(new Dog());

//        Animal animal = new Cat(); // 向上转型
//        animal.eat(); // 调用的是Cat 的eat

//        Cat cat = (Cat) animal; // 向下转型
//        cat.work();  // 调用的是 Cat 的 work
    }

    public static void print(String str, int count) {
        System.out.println(String.join("", Collections.nCopies(count, str)));
    }

    // 调用对象
    public static void show(Animal animal) {
        animal.eat();
        animal.work();
        print("*", 50);
    }
}

// 定义一个抽象基类
abstract class Animal {
    abstract void eat();

    abstract void work();
}

// 定义子类一
class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("[猫]->吃鱼");
    }

    void work() {
        System.out.println("[猫]->抓老鼠");
    }
}

// 定义子类二
class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("[狗]->吃骨头");
    }

    void work() {
        System.out.println("[狗]->看家");
    }
}