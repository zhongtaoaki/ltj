package third;

/**
 * 面向对象的特征：
 * 封装，继承，多态
 * 
 * 封装：
 * java各个类之间的接触关系，谁能看见谁
 * private关键词，使得该属性或者方法只对本类可见
 * 意味着在别的类里看不见，无法修改，无法使用，无法得知它的值
 * public关键词，意味着在本项目内所有位置都能看见
 * 
 * 访问修饰符
 * 访问修饰符可以加在类，属性，方法前面
 * 在java当中，访问修饰符有四个
 * private default protected public  
 * default的可见范围是package内部，好的代码是不用default的
 * protected的可见范围是异包子类
 * 
 * 在所有java代码里，第一行必须声明所在包的位置
 */
public class AccessDemo {
    public static void main(String[] args) {
        // TestDemo t = new TestDemo();
        // t.name = "test";
        // t.nameSetter("test");
        // System.out.println(t.nameGetter());
        TestDemo.test();

    }
}


class TestDemo{

    //不其他类生成实例的权限
    private TestDemo(){
    }

    private String name;
    private int age;

    public String nameGetter() {
        return name;
    }

    public void nameSetter(String name) {
        this.name = name+".java";
    }

    public static void test(){
        TestDemo t = new TestDemo();
        t.method();
    }

    private void method() {
        System.out.println("test");
    }

}
