package scjp;
import java.util.*;
public class TestArrayList {

	public static void main (String [] args) {
		
		List <String> myList = new ArrayList<String> ();
		List <String> testList = new ArrayList<String>();
		
		
		
		
		testList.add("Add Here");
		String s = "HI";
		myList.add(s);
		myList.add("Test123");
		myList.add("Test124");
		
		System.out.println(myList.size());
		
		myList.remove(1);
		
		System.out.println(myList.size());
		System.out.println(myList.contains("1234"));
		myList.add("1234");
		myList.add("1234");
		myList.add("1234");
		myList.add("1234");
		myList.add("1234");
		
		System.out.println(myList.contains("1234"));
		
		for (String a : myList) {
			System.out.println(a);
		}
		
		myList.remove("1234");
		myList.remove("1234");
		myList.remove("1234");
		myList.remove("1234");
		System.out.println("The Index O 0is " +myList.get(0));
		
		for (String a : myList) {
			System.out.println(a);
		}
		
	}
}
