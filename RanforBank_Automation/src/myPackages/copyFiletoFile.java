package myPackages;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyFiletoFile {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter wr = new BufferedWriter(new FileWriter("C:\\Users\\prave\\OneDrive\\Desktop\\praveencopy.txt"));
		BufferedReader rd = new BufferedReader(new FileReader("C:\\Users\\prave\\OneDrive\\Desktop\\praveen.txt"));
		 String S;
	        while ((S = rd.readLine())!=null) {
	        	wr.write(S + "\n");
	        }
			rd.close();
			wr.close();
	
	}

}
