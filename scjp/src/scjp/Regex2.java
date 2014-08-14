package scjp;
import java.util.regex.*;
import java.io.*;
public class Regex2 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d*");
		Matcher m = p.matcher("ab34e    f");
		
		
		boolean b = false;
		
		while(b = m.find()) {
			System.out.print(m.start() + m.group());
		}
		
	}
}
