package first;
/**
 * if语句本身是没有分号的
 * if语句的大括号是成对出现
 * 小括号里写判断语句 boolean
 * 大括号里写执行语句
 * 当小括号里的判断条件为true，大括号内容执行
 * 当小括号里的判断条件为false，大括号内容被跳过，执行else内容
 * 
 * 提升代码质量：
 * 可读性
 * 性能
 * 健壮性（丈夫）
 * 
 */
public class ifDemo {

    public static void main(String[] args) {

        byte position = 13;//1为公务员，2为私企员工，3为个体户
        
        switch (position) {
            case 1:
                System.out.println("执行公务员退休标准");
                break;
            case 2:
                System.out.println("执行私企员工退休标准");
                break;
            case 3:
                System.out.println("执行个体户退休标准");
                break;
            default:
                break;
        }


    }
}
