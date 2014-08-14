package scjp;

import java.io.*;
public class Maker {

	public static void main (String [] args) {
		try {File dir = new File("dir3");
		dir.mkdir();
		File file = new File(dir,"Test12.txt");
		file.createNewFile();} catch (Exception x) {
			
		}
	}
	
}
