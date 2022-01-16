package fifth;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 设计模式 享元设计模式
 * 
 * @author zhong
 *
 */
public class FlyweightDemo {

	final static String[] nameStrings = { "员工一号", "员工四号", "员工三号", "员工二号" };

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			Employee employee = EmployeeFactory.getEmployee(getRandomName());
			employee.work();
		}

	}

	private static String getRandomName() {
		return nameStrings[(int) (Math.random() * nameStrings.length)];
	}

}

class Employee {

	public String name;

	public Employee(String name) {
		this.name = name;
	}

	public void work() {
		System.out.println(name + "开始工作了");
	}

}

class EmployeeFactory {

	private static final ConcurrentHashMap<String, Employee> employeeMap = new ConcurrentHashMap<>();

	public static Employee getEmployee(String name) {

		Employee employee = employeeMap.get(name);

		if (employee == null) {
			// 初めて生成する場合
			Employee e = new Employee(name);
			employeeMap.put(name, e);
			System.out.println(name + "さんが準備しました。待機中です。");
			return e;
		}
		return employee;
	}
}
