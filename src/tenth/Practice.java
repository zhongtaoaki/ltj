package tenth;

import java.util.HashMap;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("admin", "admin");
		map.put("jack", "jack");
		map.put("satou", "123123");

		System.out.println(toJson(map));
		// 要求：程序运行后输出下列结果,只能在TODO区域作答
		// {"admin":"admin","jack":"jack","satou":"123123"}
		// 提示，可使用StringBuilder

		Map<String, String> map2 = toMap("{\"admin\":\"admin\",\"jack\":\"jack\",\"satou\":\"123123\"}");
		System.out.println(map2);
		// 要求：程序运行后输出下列结果,只能在TODO区域作答
		// {admin=admin, jack=jack, satou=123123}
		// 提示，可使用String的substring(),split()方法
	}

	static String toJson(Map<String, String> map) {
		// TODO

		return null;
	}

	static Map<String, String> toMap(String json) {
		// TODO

		return null;
	}
}
