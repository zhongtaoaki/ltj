package seventh;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder sBuilder1 = new StringBuilder("asdfadfadfasdfasf");

		StringBuilder sBuilder2 = new StringBuilder();
		sBuilder2.append("asdfadf");
		sBuilder2.insert(2, "这是字符串");
		sBuilder2.replace(2, 3, "那");
		// sBuilder2.reverse();
		// sBuilder2.delete(2, 12);

		System.out.println(sBuilder1.toString());
		System.out.println(sBuilder2.toString());

		int[] arr = { 4, 5, 6, 7, 8, 9 };

		StringBuilder sBuilder3 = new StringBuilder();
		sBuilder3.append('"');

		for (int i : arr) {
			sBuilder3.append(i);
			sBuilder3.append(',');
		}
		sBuilder3.delete(sBuilder3.length() - 1, sBuilder3.length());
		sBuilder3.append('"');

		sBuilder3.reverse();

		// “9,8,7,6,5,4”
		System.out.println(sBuilder3);

		System.out.println(palindrome("上海自来水来自海上"));
		System.out.println(palindrome("上海自来水"));

	}

	static boolean palindrome(String s) {

		StringBuilder newSBuilder = new StringBuilder(s);
		newSBuilder.reverse();

		boolean flag = true;
		for (int i = 0; i < newSBuilder.length(); i++) {
			if (s.charAt(i) != newSBuilder.charAt(i)) {
				flag = false;
			}
		}
		return flag;

	}
}

class Student{
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
}