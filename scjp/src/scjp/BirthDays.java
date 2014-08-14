package scjp;
import java.util.*;
public class BirthDays {

	public static void main(String [] args) {
		
	Map<Friends,String> hm = new HashMap<Friends,String>();
	hm.put(new Friends("Dibyendu"), "Test1");
	hm.put(new Friends("Baisakhi"), "Test2");
	Friends f = new Friends("BhisonAktaJinish");
	hm.put(f, "Test3");
	System.out.println(hm.get(f) + "...................Size is ......." + hm.size());
	System.out.println(hm.values());
	
	
	     }
	
	}

class Friends {
	String name;
	Friends(String n) {
		name = n;
	}
}
	

