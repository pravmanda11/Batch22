package myPackages;

import java.io.*;
import java.io.*;

public class readnotepadEx {

	public static void main(String[] args) throws IOException {

		BufferedReader rd = new BufferedReader(new FileReader("C:\\Users\\prave\\OneDrive\\Desktop\\praveen.txt"));
        System.out.println(rd.readLine());
        String S;
        while ((S = rd.readLine())!=null) {
        	System.out.println(S);
        }
		rd.close();

	}

}
