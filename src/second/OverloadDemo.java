package second;

/**
 * 方法签名：这个方法的唯一标志
 * 方法名＋参数
 * 当出现多个方法名相同，而方法签名不同的时候，这几个方法构成重载
 * 相同名字的方法的入参是不一致（数据类型不同，个数不同，不同数据类型的参数顺序不同）的时候，就构成重载
 * 重载的方法在调用时要注意入参的格式要与定义一致
 */
public class OverloadDemo {

    static int getArea(int a) {
        System.out.println("正方形的面积是:" + a * a);
        return a*a;
    }

    static int getArea(int a, int b) {
        System.out.println("长方形的面积是:" + a * b);
        return a*b;
    }

    public static void main(String[] args) {


        System.out.println(getArea(5)/getArea(5, 6));
    }


    //定义一些方法，实现两个数的加法 1+1, 0.1+0.1, 1+0.1,0.1+1

}
