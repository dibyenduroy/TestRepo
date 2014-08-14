package scjp;

import java.io.*;
public class Writer1 {

	public static void main (String [] args) {
		
		
		try {
			boolean newFile = false;
			File file = new File("FileWriter1.txt");
			System.out.println(file.exists());
			newFile = file.createNewFile();
			System.out.println(newFile);
			System.out.println(file.exists());
			//file.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
