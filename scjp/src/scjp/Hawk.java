package scjp;


class Bird {
{ System.out.print("b1 "); }//4
public Bird() { System.out.print("b2 "); }//5
}

class Raptor extends Bird {
static { System.out.print("r1 "); } //1
public Raptor() { System.out.print("r2 "); }//6
{ System.out.print("r3 "); }//5
static { System.out.print("r4 "); }//2
}

public class Hawk extends Raptor  {
	public static void main(String[] args) {
		System.out.print("pre ");//3
		new Hawk();
		System.out.println("hawk ");//7
		}
	
}
