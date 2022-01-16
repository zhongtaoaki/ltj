package fifth;

/**
 * 包装类 基本数据类型：int byte short long float double char boolean 引用数据类型:Integer Byte
 * Short Long Float Double Character Boolean 自动数据类型转换，基本数据类型是可以自动转换为包装类的
 * 
 * @author zhong
 *
 */
public class WrapperDemo {

	public static void main(String[] args) {

		int i = 1;

		// 标准写法
		Integer k = 127;

		Integer l;
		l = 127;

		Integer integer2 = new Integer(1);

		System.out.println(k == integer2);
		System.out.println(k == l);

	}
}
