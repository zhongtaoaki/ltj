package third;

/**
 * 接口一定是public
 * 方法默认是public
 * 接口不可以有属性和非抽象方法
 * 抽象方法不需要用关键词Abstract定义
 * 接口是多重实现的
 * 接口里的变量默认是final且static的
 * 1.8以后允许出现非抽象方法
 */
public interface ObjectsCanBite {

    String a = "test";

    void bite();

    default void test() {
        System.out.println(a);
    }

}
