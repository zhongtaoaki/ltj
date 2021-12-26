package third;

/**
 * 构造方法是在new的时候被调用
 * 也可以在另一个构造器被调用
 * 在另一个构造器被调用的时候，this.构造器只能出现在第一行
 * 并且，只能出现一次
 */
public class TestThis {
    
    private int i;

    TestThis(int i) {
        this.i = i;
        System.out.println("int构造器的i：" + i + ",this.i：" + this.i);
    }

    TestThis(String s){
        System.out.println("string构造器"+s);
    }

    TestThis(int i, String s){
        this(s);
        this.i = 2;
    }
}
