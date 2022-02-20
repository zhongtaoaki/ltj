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
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		map.keySet().stream().forEach(k ->{
			sb.append("\"");
			sb.append(k);
			sb.append("\":\"");
			sb.append(map.get(k));
			sb.append(",");
		});
		sb.deleteCharAt(sb.length()-1);
		sb.append("}");
		return sb.toString();
	}

	static Map<String, String> toMap(String json) {
		
		// {"admin":"admin","jack":"jack","satou":"123123"}
		
		Map<String, String> map = new HashMap<>();
		
		json = json.substring(1, json.length()-1);
		String[] elements = json.split(",");
		for (String element : elements) {
			String[] subElements = element.split(":");
			System.out.println(subElements[0]);
			//map.put(subElements[0].substring(1,subElements[0].length()-1), subElements[1].substring(1,subElements[1].length()-1));
			String key = subElements[0].substring(1,subElements[0].length()-1);
			String value = subElements[1].substring(1,subElements[1].length()-1);
			map.put(key, value);
		}
		return map;
	}
}
