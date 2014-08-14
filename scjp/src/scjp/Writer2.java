package scjp;
import java.io.*;
public class Writer2 {

	public static void main (String [] args) {
		
		char [] in = new char [50];
		int size = 0;
		try {
			File dr = new File("Test");
			dr.mkdir();
			
			File file = new File(dr,"FileWriter2.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("test\nfolks\n");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(file);
			size = fr.read(in);
			System.out.print(size + " ");
			for(char c : in) {
				System.out.print(c);
				fr.close();
			}
			
		} catch (IOException e) {
			System.out.print("Went into exception");
		}
		
	}
	
}
