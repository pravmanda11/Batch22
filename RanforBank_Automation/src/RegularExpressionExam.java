import java.util.regex.Pattern;

public class RegularExpressionExam {

	public static void main(String[] args) {

		// System.out.println(Pattern.matches("[Praveen]?", "P")); //a is present or not
		// in given string
		// System.out.println(Pattern.matches("[Praveen]+", "Pra"));
		// System.out.println(Pattern.matches("...C", name)); //Last Character

		//System.out.println(Pattern.matches("\\d", "1"));// will check if any digit is there in string
		//System.out.println(Pattern.matches("\\D", "m")); // non-digit
		//System.out.println(Pattern.matches("\\D*", "moon"));
		
		//String name = "HIab987";
		//System.out.println(Pattern.matches("[A-Za-z0-9]{9}", name));  //[A-Z][a-z][0-9]
		
		String num = "919953038949";
		
		System.out.println(Pattern.matches("[9]{1}[1]{1}[0-9]{10}", num)); //true
		
		String name = "Hello123A";
		
		System.out.println(Pattern.matches("[A-Z]{1}[a-z]{4}[0-9]{3}[A-Z]{1}", name));
		
		
		
		
		
		
		
		
		

	}

}
