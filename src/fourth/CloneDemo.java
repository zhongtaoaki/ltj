package fourth;

/**
 * 浅copy shallow copy
 * 用赋值符号实现
 * 深copy deep copy
 * 用clone（）方法实现
 * 必须要实现Cloneable接口，然后重写clone方法并抛异常
 * 接口Cloneable是一个标记型接口，他没有内容
 * 他存在的意义就是给实现了这个接口的类打上标记
 */
public class CloneDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student("张三", 25);
        Student s2 = s1;
        // Student s2 = (Student) s1.clone();
        s2.age = 26;
        System.out.println(s1.age);
    }
}

class Student implements Cloneable {

    public String name;
    public int age;

    Student() {
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

}