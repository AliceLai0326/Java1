package tw.com.JAVA;

import java.util.HashMap;
import java.util.Set;

public class Brad36 {

	public static void main(String[] args) {
		HashMap<String, Object> persion = new HashMap<String ,Object>();
		persion.put("name", "Brad");
		persion.put("gender", true);
		persion.put("age", 18);
		persion.put("w", 79.7);
		System.out.println(persion.size());
		persion.put("age", "25");
		System.out.println(persion.size());
		persion.put("alias", "Brad");
		System.out.println(persion.size());
		System.out.println("----");
		Set<String> keys = persion.keySet();
		for (String key : keys) {
			System.out.println(key + ":" + persion.get(key));
		}
		
	}

}
