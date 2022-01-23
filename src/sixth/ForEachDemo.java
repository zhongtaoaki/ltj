package sixth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("张三", 23, (byte) 0));
		list.add(new Student("李四", 23, (byte) 0));
		list.add(new Student("王五", 50, (byte) 1));
		list.add(new Student("赵六", 23, (byte) 1));
		list.add(new Student("钱七", 13, (byte) 1));

		// Comparator<Student> comparator = (s1, s2) -> s1.age - s2.age;

		// 插入5个学生，把男生按照年龄从小到大排序，并打印出来名字和年龄
		list.stream().filter(n -> n.gender == 1).sorted((s1, s2) -> s1.age - s2.age)
				.forEach(n -> System.out.println(n));
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		Student s1 = (Student) o1;
//		Student s2 = (Student) o2;
////		if (s1.age < s2.age) {
////			return -10000;
////		} else if (s1.age > s2.age) {
////			return 1543536543;
////		} else {
////			return 0;
////		}
//
//		return s1.age - s2.age;
//	}
}

class Student {
	public String name;
	public int age;
	public byte gender;// 1为男性，0为女性

	public Student(String name, int age, byte gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "姓名: " + name + " 年龄: " + age + " 性别: " + gender;
	}

}