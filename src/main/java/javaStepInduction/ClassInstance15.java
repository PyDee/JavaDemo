// 15
package javaStepInduction;

public class ClassInstance15 {
    public static void main(String[] args) {
        Person ps = new Person();
        ps.setAge(10);
        System.out.println(ps.getAge());
    }

}

class Person {
    /**
     *
     */
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new NumberFormatException("当前年龄超范围了");
        } else {
            this.age = age;
        }
    }
}