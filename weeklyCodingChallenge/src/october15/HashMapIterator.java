package october15;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapIterator {
	
	
	public static void iterator(HashMap<Integer, String> map) {
		
		Iterator<Integer> keySet = map.keySet().iterator();
		System.out.println("Iteration With a While Loop: ");
		
		while(keySet.hasNext()) {
			int key = keySet.next();
			System.out.println("Key: " + key + " , Value: " + map.get(key) );
		}
		
		System.out.println("\n\nIteration With an Enhanced For Loop:\n");
		
		for(int key: map.keySet()) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}
		
	}

	
	public static void main(String[] args) {
		HashMap<Integer, String> testMap = new HashMap<>();
		testMap.put(1, "apple");
		testMap.put(2, "orange");
		testMap.put(3, "banana");
		
		iterator(testMap);

	}

}
