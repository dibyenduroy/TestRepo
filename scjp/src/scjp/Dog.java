package scjp;


class Animal2 {
	static void doStuff(){
		System.out.println("a ");
	}
}


public class Dog extends Animal2 {
	
	static void doStuff() {
		System.out.println("d ");
	}

	public static void main(String [] args) {
		Animal2 [] a = {new Animal2(), new Dog(), new Animal2()};
	for (int x=0;x<a.length;x++) {
		a[x].doStuff();
	}
}
	
}
