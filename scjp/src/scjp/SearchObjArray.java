package scjp;
import java.util.*;
public class SearchObjArray {

	public static void main(String [] args) {
		String [] sa = {"one", "two", "three", "four"};
		
		Arrays.sort(sa);
		for(String a : sa) {
		System.out.println(a);
		}
		System.out.println("\n"+"***********************************************");
		
		//System.out.println(Arrays.binarySearch(sa, "two"));
		
		ReSortComparator rs = new ReSortComparator();
		Arrays.sort(sa,rs);
		for(String a : sa) {
			System.out.println(a);
			}
		System.out.println("\n"+"***********************************************");
		
		
	}
	
	static class ReSortComparator implements Comparator<String> {
		
		public int compare(String a, String b) {
			return b.compareTo(a);
		}
		
		
	}
	
	
	
}
