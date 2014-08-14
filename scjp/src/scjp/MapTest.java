package scjp;

import java.util.*;

class Doverman {
	public String name;
	public Doverman (String n) {
		name = n;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doverman other = (Doverman) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
class Cat { }

enum Pets {DOG, CAT, HORSE }

public class MapTest {
	
	public static void main(String[] args) {
		Map<Object,Object> m = new HashMap<Object,Object>();
		m.put("K1", new Doverman("Jonny"));
		m.put("K2",Pets.CAT);
		m.put(Pets.CAT, "CAT key");
		Doverman d1 = new Doverman("Clover");
		m.put(d1, "Dog Key");
		m.put(new Cat(), "Cat Key");
		System.out.println(m.get("K1"));
		String K2 = "K2";
		System.out.println(m.get(K2));
		Pets p = Pets.CAT;
		System.out.println(m.get(p));
		System.out.println(m.get(d1));
		System.out.println(m.get(new Cat()));
		System.out.println(m.size());
	}

}
