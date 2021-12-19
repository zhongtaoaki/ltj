package second;

/**
 * 变量的生效范围是他声明位置的最近一层的代码块
 */
public class Practice3 {

    public static void main(String[] args) {

        int count = 0;

        for (int number = 2; number < 2000; number++) {
            //判断number是否为素数
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
        }
        System.out.println("素数的数量为:" + count);
    }

    static boolean isPrime(int number){
        for (int i = 2; i < number; i++) {
            if (number%i == 0) {
                return false;
            }
        }
        return true;
    }
}
