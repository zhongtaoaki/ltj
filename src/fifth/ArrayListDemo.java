package fifth;

import java.util.ArrayList;
import java.util.List;

/**
 * 数组是长度固定，所有元素的数据类型都是一致的
 * ArrayList的所有元素的数据类型都是一致的，但是长度不固定
 * @author zhong
 *
 */
public class ArrayListDemo {

	public static void main(String[] args) {

		int[] array = new int[3];

		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(20);
		arrayList.add(10);
		arrayList.add(11);
		arrayList.add(25);
		arrayList.add(15);
		arrayList.add(20);
//		arrayList.add(0, 6);
		
//		arrayList.remove(1);
		
		arrayList.set(0, 6);
		
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.size());
		
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//		}
		
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		
	}

}
