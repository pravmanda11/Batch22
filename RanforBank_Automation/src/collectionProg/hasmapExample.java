package collectionProg;

import java.util.HashMap;
import java.util.Map;

public class hasmapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(01, "Praveen"); // Key + value
		map.put(02, "Kiran");
		map.put(03, "Anusha");
		map.put(04, "Sneha");
		map.put(05, "Sneha");
	    map.put(06, "");
	    map.put(null, "hello");
	    
	    /*for (Map.Entry values : map.entrySet()) {
			System.out.println(values.getKey() + "  " + values.getValue());
		}
	    map.remove(06);*/

		for (Map.Entry values : map.entrySet()) {
			System.out.println(values.getKey() + "  " + values.getValue());
		}

	}

}
