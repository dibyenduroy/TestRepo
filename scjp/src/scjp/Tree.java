package scjp;

interface Vessel { }
interface Toy { }
class Boat implements Vessel { }
class Speedboat extends Boat implements Toy { }

public class Tree {
	public static void main(String[] args) {
		String s = "0";
		Boat b = new Boat();
		Boat b2 = new Speedboat();
		Speedboat s2 = new Speedboat();
		if((b instanceof Vessel) && (b2 instanceof Toy)) s += "1";
		if((s2 instanceof Vessel) && (s2 instanceof Toy)) s += "2";
		System.out.println(s);
		
		int x = 10;
		
		switch (x) {
		
		case 1: {System.out.println(1);}
		case 2: System.out.println(2);
		//default : System.out.println(x);
		
		
		
		}
		int i =0;
		int j=11;
		while(i <=10) {
			System.out.println(i);
			i++;
			
		}
		
		do {
			System.out.println(j);
			j++;
		} while (j <=10);
		
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		
		try { for (int k : a) {
			
			System.out.println(k);} } 
		catch (Exception e) {
			
		} finally {
			System.out.println("Test");
		}
		
	}
	
	
	
}
