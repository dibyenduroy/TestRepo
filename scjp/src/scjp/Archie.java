package scjp;
import java.util.regex.*;
public class Archie {
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("ab2c4d67");
		int count = 0;
		while(m.find())
			count++;
		System.out.print(count);
	}

}
