package fifth;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(0);
		linkedList.add(1);
		
		linkedList.add(0, 10);
		
		System.out.println(linkedList.get(0));
	}
}
