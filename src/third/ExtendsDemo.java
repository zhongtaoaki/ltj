package third;

/**
 * 继承 extends
 * 子类会继承父类里的所有非private的属性和方法
 * 子类可以用super和this关键词去区分去父类的同名变量
 * 重写（override）
 * 子类中重新写与父类方法方法签名相同的方法时，这两个方法构成重写
 * java里不可以多重继承的
 * 抽象类：不用来生成实例的类
 * 抽象类中可以有抽象方法，有抽象方法的一定是抽象类
 * 抽象方法一定要被重写
 * 
 * 多态
 * 多态有三个条件:继承，重写，父类引用指向子类
 */
public class ExtendsDemo {

    public static void main(String[] args) {

        Animal c = new Cat();
        c.bite();
        Animal d = new Dog();
        d.bite();

        Animal[] animals = {c,d};
        for (Animal animal : animals) {
            animal.bite();
        }
    }
}

abstract class Animal {
    public int weight;
    public String name;
    public int age;
    abstract void bite();
}

//实体类
class Cat extends Animal {

    public void bite(){
        System.out.println("miao");
    }
}

class Dog extends Animal {

    public void bite(){
        System.out.println("wang");
    }

}
