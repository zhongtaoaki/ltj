package sixth;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {

		char[] charArray = { 'f', 'a', 'c', 'b', 'c', 'd', 'a', 'e', 'e', 'd', 'c', 'b', 'd', 'c' };

		Map<Character, Integer> map = new HashMap<>();

		for (char c : charArray) {
			if (!map.containsKey(c)) {
				map.put(c, 1);//初始化
			} else {
				map.put(c, map.get(c) + 1);
			}
		}

		for (Character c : map.keySet()) {
			System.out.println(c + " : " + map.get(c));
		}

	}

}
