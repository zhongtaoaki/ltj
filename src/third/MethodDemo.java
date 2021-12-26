package third;

/**
 * static
 * method
 * constructor
 * 
 * 动态方法，需要用对象.方法名的方式去调用
 * 每一个对象（引用数据类型）的默认值是null
 * static表示静态，这个方法或者属性是属于类而不是属于对象的
 * 调用静态方法使用类.方法名的方式,在同一个类里，类名可以省略
 * 在静态方法中不能使用非静态成员变量，只能使用静态成员变量
 * 
 * final关键词可以使静态变量无法改变，使之成为一个常量（定数）
 * 
 * 构造器（constructor）
 * 以类名作为方法名的方法
 * 每一个类，都有一个默认构造器，默认的是一个无参空构造
 * 生成一个对象的时候会调用这个构造方法
 * 当你人为写一个构造器的时候，原来的默认的无参空构造就失效了
 * 构造器一般用来在new一个对象时候顺便给他初始化他的属性值
 * this.变量的方式去明确这个是field
 * 
 */
public class MethodDemo {

    public static void main(String[] args) {

        Cat a = new Cat("张二狗", 2, false);
        Cat b = new Cat("鸡腿", 4, true);

        Cat c = new Cat();
        c.name = "other";
        c.age = 1;
        c.gender = true;

        a.name = "2132";
        a.catchMouse();
        b.catchMouse();

    }

}

class Cat {

    Cat() {
    }

    // 这是一个构造器
    Cat(String name) {
        this.name = name;
    }

    Cat(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.count ++;
    }

    String name;
    int age;
    boolean gender;
    static int count = 0 ;

    void catchMouse() {
        System.out.println(name + "已经开始抓老鼠了。");

    }

}
