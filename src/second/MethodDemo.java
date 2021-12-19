package second;

/**
 * 方法 method メソッド
 * 参数
 * 方法体
 * 返回值
 * 
 * 方法的声明
 * 修饰子 返回值的数据类型 方法名(参数){方法体}
 * 修饰子：今天我们只使用static修饰词，静态方法
 * 方法名:使用小驼峰命名
 * 参数: 变量的声明（数据类型 变量名）
 * 参数可以是多个，用逗号隔开，使用时有顺序,这多个参数的数据类型是可以不一样的
 * return 返回值
 * 方法声明在类内方法外
 * 
 * 
 * 使用
 * 在同一个类中，静态方法可以直接调用
 * 使用方法的地方在方法内
 * 调用方法时，方法小括号内的参数要符合定义
 * 当你的方法有返回值的时候，请务必使用这个返回值
 * 
 * 变量的生命周期
 * 变量的生命周期是他声明位置最近的大括号范围内
 */
public class MethodDemo {
    
    static int power(int[] array, int index){

        int result = array[index];

        return result;
    } 

    public static void main(String[] args) {
        
        int[] array = {1,2,3};

        int i = power(array,2);
        System.out.println(i);

    }

}
