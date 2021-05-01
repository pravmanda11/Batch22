package collectionProg;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
	
	  ArrayList<String> list = new ArrayList<String>();
	 
	 list.add("Praveen");  //0
	 list.add("Kiran"); //1
	 list.add("Sruthi"); //2
	 list.add("Jaswhanth"); //3
	 list.add("Hema"); //4
	 
	// System.out.println(list);
	 
	/* Iterator it = list.iterator();
	 
	 while (it.hasNext()) {
		 System.out.println(it.next());
	 }*/
	 
	/* System.out.println("Before Modifying the value of 1st  is = "  + list.get(0));   //Praveen
	 
	 list.set(0, "Kumar");  //1-Kumar
	 list.set(1,"kiran kumar");
	 list.set(4, "Hema Latha");*/
	 
	 System.out.println("Before Removing elements");
	 //For each loop
	 for(String names : list) {
		System.out.println(names); 
	 }
	 
	 list.remove(2);
	 list.remove(3);
	
	 
	 list.add(3,"Selenium");
	 
	 
	 
	 System.out.println("After Removing elements");
	 for(String names : list) {
			System.out.println(names); 
		 }
	 

	}

}
