package scjp;

import java.util.*;
public class TestSort1 {

	public static void main(String [] args) {
		List <String> myStuff = new ArrayList<String> ();
		myStuff.add("C");
		myStuff.add("Z");
		myStuff.add("D");
		myStuff.add("U");
		
		System.out.println(myStuff);
		Collections.sort(myStuff);
		System.out.println(myStuff);
		myStuff.remove(2);
		System.out.println(myStuff);
		myStuff.add("U");
		System.out.println(myStuff);
		
	}
}
