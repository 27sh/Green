package list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		
		map.put("사과", "apple");
		map.put("바나나", "banana");
		map.put("복숭아", "peach");
		
		String value = map.get("사과");
		System.out.println(value);
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
