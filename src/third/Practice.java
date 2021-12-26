package third;

public class Practice {

    // 练习一；阶乘
    static int fact(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // 练习二：各位数相加
    static int digitSum(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }

    // 练习三：计算器
    static String caculate(int first, char operator, int second) {

        switch (operator) {
            case '+':
                return first + second + "";
            case '-':
                return first - second + "";
            case '*':
                return first * second + "";
            case '/':
                if (second == 0) {
                    return "非法输入";
                }
                return first / second + "";
            default:
                return "您的运算符输入错误：" + operator;
        }

    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(digitSum(828));
        System.out.println(caculate(1, '1', 0));
    }

}
