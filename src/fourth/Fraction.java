package fourth;

public class Fraction {

    private int numerator;// 分子
    private int denominator;// 分母

    // 无参空构造
    public Fraction() {
    }

    // 有参构造，分母不为零
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("分母不能为0");
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    // 乘法方法，返回乘法结果
    public Fraction multiple(Fraction f) {
        this.numerator *= f.numerator;
        this.denominator *= f.denominator;
        return this;
    }

    // 输出方式
    public String toString() {
        return numerator + "/" + denominator;
    }

    // 约分
    public Fraction reduction() {
        // 三目运算
        // int smaller = numerator > denominator ? denominator : numerator;
        int smaller;
        if (numerator > denominator) {
            smaller = denominator;
        } else {
            smaller = numerator;
        }

        while (numerator % smaller != 0 || denominator % smaller != 0) {
            smaller--;
        }
        denominator /= smaller;
        numerator /= smaller;
        return this;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(3, 4);
        System.out.println(f1.multiple(f2).reduction().toString());

    }

}
