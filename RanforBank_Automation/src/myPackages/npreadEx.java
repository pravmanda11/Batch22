package myPackages;

import java.io.*;

public class npreadEx {

	public static void main(String[] args) throws IOException {
	
		BufferedWriter wr = new BufferedWriter(new FileWriter("C:\\Users\\prave\\OneDrive\\Desktop\\praveen.txt"));
		
		wr.write("Hi I am Praveen\n");
		wr.write("Hi I am Praveen\n");
		wr.write("Hi I am Praveen");
        wr.close();
	}

}
