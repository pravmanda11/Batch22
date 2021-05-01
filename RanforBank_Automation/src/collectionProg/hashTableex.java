package collectionProg;

import java.util.Hashtable;
import java.util.Map;

public class hashTableex {

	public static void main(String[] args) {
	
	Hashtable<Integer,String>  ht = new Hashtable<Integer,String>();
	
	ht.put(100, "Apples");
	ht.put(200, "Oranges");
	ht.put(300, "Bananans");
	
	for(Map.Entry values : ht.entrySet()) {
		System.out.println(values.getKey() +  "   " + values.getValue());
	}

	}

}
