package fifth;

import java.util.Iterator;

import javax.swing.text.Position.Bias;

/**
 * math类里都是静态方法
 * 因为静态方法使用类.方法名的方式调用，所以Math.方法名()
 * @author zhong
 *
 */
public class MathDemo {

	public static void main(String[] args) {

		int i = 1;
		int j = 2;

//		if (i < j) {
//			System.out.println(i);
//		} else {
//			System.out.println(j);
//		}

		int k = Math.max(i, j);
		System.out.println(k);
		
		System.out.println(Math.abs(-5));
		
		System.out.println(Math.floor(4.99));
		System.out.println(Math.ceil(4.01));
		System.out.println(Math.round(4.4));
		System.out.println(Math.random());
		
		System.out.println(Math.pow(5, 2));
		
		// 2的3次方和3的2次方谁大？
		// 10以内的所有情况
		
		for (int a = 1; a < 10; a++) {
			compare(a);
			
		}
	}
	
	public static void compare(int i) {
		
		int a = (int) Math.pow(i, i+1);
		int b = (int) Math.pow(i+1, i);
		
		if (a<b) {
			System.out.println(i+"的"+(i+1)+"次方比"+(i+1)+"的"+i+"次方小");
		}else if (a>b) {
			System.out.println(i+"的"+(i+1)+"次方比"+(i+1)+"的"+i+"次方大");
		}else{
			System.out.println(i+"的"+(i+1)+"次方和"+(i+1)+"的"+i+"次方相等");
		}
		
		
	}
	
}
