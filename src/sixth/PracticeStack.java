package sixth;

import java.util.ArrayList;

public class PracticeStack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		for (int i = 0; i < 4; i++) {
			System.out.println(stack.pop());
		}
	}

}

class Stack<E> {

	public ArrayList<E> arrayList = new ArrayList<E>();

	public void push(E integer) {
		arrayList.add(integer);
	}

	public E pop() {
		return arrayList.remove(arrayList.size() - 1);
	}

}