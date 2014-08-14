package scjp;

import java.io.*;
public class FileSearch {

	public static void main (String [] args) {
		
		String [] files = new String[100];
		File search = new File("Test");
		files = search.list();
		
		for(String fn : files) {
			System.out.println("found " + fn);
		}
		
	}
	
}
