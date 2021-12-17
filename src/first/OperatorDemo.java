package first;
/**
 * 算数运算符
 * 赋值运算符
 * 比较运算符 
 * 逻辑运算符(and且 or或 not非)
 */

public class OperatorDemo {
    
    public static void main(String[] args) {
        
        int i = 57;
        int j = 13;

        boolean b1 = i>j;
        boolean b2 = i==j;

        System.out.println(i>j || i==j && !(i<j));

        j=0;
        if (j!=0) {
            System.out.println(i/j);
        }
        

    }
}
