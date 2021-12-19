package second;

/**
 * 方法的使用一定是在方法内
 * 也可以是调用自身，方法的递归 再帰
 * 方法内部调用自己时，一定要有判断条件（终止）
 */
public class RecursionDemo {

    // 给一个数（100），求出100以内所有正整数的和
    // 算阶乘 n！

    static int sum(int number) {

        int sum = 0;

        if (number > 0) {
            sum = number + sum(number - 1);
        } else {
            sum =  0;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(100));
    }
}
