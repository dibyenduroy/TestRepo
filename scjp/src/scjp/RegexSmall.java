package scjp;
import java.util.regex.*;;
public class RegexSmall {
	public static void main(String [] args) {
		Pattern p = Pattern.compile("aab");
		Matcher m = p.matcher("abaaaba");
		while(m.find()) {
			System.out.print(m.start() + " ");
		}
	}

}
