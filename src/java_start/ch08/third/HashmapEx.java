package java_start.ch08.third;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx {
	public static void main(String[] args) {
		
		Map<String, Integer> m = new HashMap<>();
		
		m.put("진석",0);
		
		for(int i=1; i <=17; i++) {
			m.put("진석"+ i, i);
		}
//		
		for(int i=1; i< m.size();i++) {
			System.out.println(m.get("진석"+i));
		}
		
		for(String key: m.keySet()) {
			Integer keyValue = m.get(key);
			System.out.println(key + ""+ keyValue);
		}
		
	}
}
