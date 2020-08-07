package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("java", 58);		// return null
		m.put("java", 60);		//58 is replaced with 60, returns 58, size is not increased
		m.put("c", 70);
		m.put("database", 90);
		System.out.println("size = "+m.size());
		System.out.println(m);
		Integer i1 = m.get("java");
		System.out.println(i1);
		}
}
