package ninth;

public class Practice {

	public static void main(String[] args) {

		// 练习一：统计一个字符串里各个字符出现的次数
		// 要求1：该字符串只有英文字母和空格，不统计空格
		// 要求2：按规定格式输出
		// 提示：char ch[] = string.toCharArray();（非静态方法可将字符串转化成char类型数组）
		String string = "Hello World and hello world";
		System.out.println(getTimes(string));
		// "H:1 W:1 a:1 d:3 e:2 h:1 l:6 n:1 o:4 r:2 w:1"

		// 练习二：按字母倒序输出
		// 提示：List<Character> arrayList = new ArrayList<>(set);（可将Set转化成ArrayList）
		System.out.println(getTimes(string));
		// "w:1 r:2 o:4 n:1 l:6 h:1 e:2 d:3 a:1 W:1 H:1"
		
		//拓展：能否做到忽略大小写

	}

	private static String getTimes(String string) {
		//TODO
		return null;
	}

}
