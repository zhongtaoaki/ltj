package second;

/**
 * 方法
 * 静态方法的声明和使用
 * 方法的重载
 * 变量的作用域
 * 方法的递归
 * 数据结构？？？
 * 算法：冒泡排序
 * 
 */
public class App {

    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]<array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
    }

    public static void main(String[] args) {

    }
}
