package scjp;

import java.text.*;
import java.util.*;

public class DateTwo {

	public static void main (String [] args) {
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,Locale.GERMANY);
		System.out.println(df.format(d));
	}
	
	
	
}
