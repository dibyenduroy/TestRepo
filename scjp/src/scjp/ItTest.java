package scjp;

import java.util.*;

class Cow {
public String name;
Cow(String n) { name = n; }
}

public class ItTest {

	public static void main(String[] args) {
		List<Cow> d = new ArrayList<Cow>();
		Cow cow = new Cow ("Tommy");
		d.add(cow);
		d.add(new Cow("Pommy"));
		d.add(new Cow("Zommy"));
		d.add(new Cow("Nommy"));
		d.add(new Cow("Lommy"));
		
     System.out.println(d);
		
		
		Iterator <Cow> i3 = d.iterator();
		while (i3.hasNext()) {
			Cow d2 = i3.next();
			System.out.println(d2.name);
		}
		
		System.out.println("size " + d.size());
		System.out.println("get1 " + d.get(1).name);
		System.out.println("aiko " + d.indexOf(cow));
		d.remove(2);
		Object[] oa = d.toArray();
		//System.out.println(oa);
		for(Object o : oa) {
			Cow d2 = (Cow)o;
			System.out.println("oa " + d2.name);
		}
		
		
		
	}
}
