
public class stratsendswith {

	public static void main(String[] args) {
		
		String Name = "Praveen";  
		
		System.out.println(Name.startsWith("P"));  //true
		System.out.println(Name.startsWith("K"));  //false
		System.out.println(Name.startsWith("Pra")); //true
		System.out.println(Name.endsWith("n"));  //true
		System.out.println(Name.endsWith("veen")); //true
	}

}

