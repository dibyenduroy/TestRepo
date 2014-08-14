package scjp;

class FooRunnable implements Runnable {
	public void run() {
		for (int x = 1; x < 6; x++) {
			System.out.println("Runnable running");
		}
	}
}

public class TestThreads  extends FooRunnable {
	
	public void run() {
		System.out.println("This is a Runnable Thread");
	}

	public static void main(String[] args) {
		TestThreads r = new TestThreads();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		//Thread t3 = new Thread(r);
		
		t1.start();
		t2.start();
		

	}

}
