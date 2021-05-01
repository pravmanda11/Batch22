package collectionProg;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("Praveen");
		set.add("Praveen1");
		set.add("Praveen2");
		set.add("Praveen3");

		System.out.println(set);

		set.size();

		for (String value : set) {
			System.out.println(value);
		}
	}

}
