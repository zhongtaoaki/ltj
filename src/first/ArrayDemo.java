package first;
/**
 * 数组 array
 * 数组里面的数据类型必须保持一致 int char float String
 * 声明 使用
 * 类型[] 变量名 = {元素1，元素2，元素3.....};
 * 
 * 数组的特征:
 * 有顺序，并且从0开始数
 * 有长度，不可变，在指定下标的时候不可以超出数组长度
 * +
 * 错误
 * 编译错误：运行之前发生,编译时候遇到的错误
 * 运行例外：运行了才发生的错误
 * "java.lang.ArrayIndexOutOfBoundsException:"
 */

public class ArrayDemo {

    public static void main(String[] args) {

        int[][]  numbers = {{0,1,2},{2,3,4},{5,6,7}};

        for (int[] is : numbers) {
            
            for (int i : is) {
                System.out.println(i);
            }

        }
        

    }




}
