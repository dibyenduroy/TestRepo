package scjp;

import java.util.*;

public class ArraytoList {
	public static void main(String [] args) {
	
	String [] sa ={"A","D","C","B"};
	List sList = Arrays.asList(sa);
	
	sList.set(0, "T");
	//sList.add(4,"Z");
	
	for(String a : sa)
	{
		System.out.println("index : " + sList.indexOf(a) + "   " + a);
	}
	
	
	
	}
}
