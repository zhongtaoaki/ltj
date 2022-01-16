package fifth;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * list都是有顺序的，所以有下标 set是没有顺序的，每一个都不能重复
 * 
 * @author zhong
 *
 */
public class SetDemo {

	public static void main(String[] args) {

		HashSet<CountrySet> countries = new HashSet();

		countries.add(new CountrySet("USA", "Washington DC"));
		countries.add(new CountrySet("Norway", "Oslo"));
		countries.add(new CountrySet("England", "London"));
		countries.add(new CountrySet("Germany", "Berlin"));

//		for (CountrySet c : countries) {
//			System.out.println(c);
//		}

		// 迭代器
		Iterator<CountrySet> countryIterator = countries.iterator();

		while (countryIterator.hasNext()) {
			System.out.println(countryIterator.next());

		}

	}

}

class CountrySet {
	public String name;
	public String capitalName;

	public CountrySet(String name, String capitalName) {
		this.name = name;
		this.capitalName = capitalName;
	}

	@Override
	public String toString() {
		return name + ": " + capitalName;
	}

}
