package fourth;

/**
 * 枚举,本质上还是一个类，是一个只有常量的类
 * 常量是被 final static 修饰的变量
 * 枚举的声明在类外，或者类内 使用关键词enum
 * 注意命名时请全部大写，因为都是常量
 * 枚举的使用使用枚举.变量名
 * 对于枚举来说，toString方法也可以写成name()
 * 
 * 评判一个代码的优劣的时候，可以从三个角度
 * 可读性，扩展性，性能
 */
public class EnumDemo {

    public final static int NUMBER = 0;

    public static void main(String[] args) {

        // Season s = Season.SPRING;

        for (Season s : Season.values()) {
            switch (s) {
                case SPRING:
                    System.out.println("春天来了");
                    break;
                case SUMMER:
                    System.out.println("夏天来了");
                    break;
                case AUTUMN:
                    System.out.println("秋天来了");
                    break;
                case WINTER:
                    System.out.println("冬天来了");
                    break;
                default:
                    break;
            }
        }

        System.out.println("这个枚举的中文名是：" + Season.SPRING.chinese);

        Season s2 = Season.SPRING;
        Season s3 = Season.valueOf("SPRING");

    }
}

enum Season {
    SPRING("春季"), SUMMER("夏天"), AUTUMN("秋天"), WINTER("冬天");

    public String chinese;

    Season(String chinese) {
        this.chinese = chinese;
    }

}
