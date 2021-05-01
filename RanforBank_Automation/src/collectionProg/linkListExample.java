package collectionProg;

import java.util.Iterator;
import java.util.LinkedList;

public class linkListExample {

	public static void main(String[] args) {
	
	LinkedList<String> list = new LinkedList();
	
	list.add("Praveen0");
	list.add("Praveen1");
	list.add("Praveen2");
	list.add("Praveen3");
	
	/*Iterator<String> it = list.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}*/
	System.out.println("Totals elements in list is =  "  +  list.size());
	
	//For each loop
	/*for(String names: list) {
		System.out.println(names);
	}*/
	
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
	
	list.remove(0);
	list.removeAll(list);
	list.set(2, "kumar");

}

}
