package eighth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbTest {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;

		String url = "jdbc:postgresql://localhost:5432/lighthouse";
		String user = "postgres";
		String password = "123456";

		List<Student> students = new ArrayList<>();

		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("数据库链接成功");

			statement = connection.createStatement();
			String sql = "select * from student;";
			result = statement.executeQuery(sql);

			while (result.next()) {
				System.out.println("数据库查询成功");
				students.add(new Student(result.getInt(1), result.getString(2), result.getInt(3)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)connection.close();
				if (statement != null)statement.close();
				if (result != null)result.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		students.stream().filter(t -> t.math < 70).forEach(t -> System.out.println(t));

	}

}

class Student {

	public int id;
	public String name;
	public int math;

	public Student(int id, String name, int math) {
		super();
		this.id = id;
		this.name = name;
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", math=" + math + "]";
	}

}
