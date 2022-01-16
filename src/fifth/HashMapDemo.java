package fifth;

import java.util.HashMap;
import java.util.Set;

/**
 * hashmap用key value的形式存储数据 是没有顺序的 key不能重复
 * 
 * @author zhong
 *
 */
public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Country, Capital> studentMap = new HashMap<>();

		studentMap.put(new Country("USA"), new Capital("Washington DC"));
		studentMap.put(new Country("Norway"), new Capital("Oslo"));
		studentMap.put(new Country("England"), new Capital("London"));
		studentMap.put(new Country("Germany"), new Capital("Berlin"));

		// System.out.println(studentMap.get(7530));

		// 遍历
		Set<Country> ketSet = studentMap.keySet();
		for (Country i : ketSet) {
			System.out.println(i + ": " + studentMap.get(i));
		}

	}
}

class Country {
	public String name;

	public Country(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}

class Capital {
	public String name;

	public Capital(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
