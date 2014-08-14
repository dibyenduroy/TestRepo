package scjp;


class NameRunnable implements Runnable {
	
	public void run() {
		System.out.println("NameRunnable running");
		System.out.println("Run by "
				+ Thread.currentThread().getName());
	}
}

public class NameThread {
	
	public static void main (String [] args) {
		System.out.println("thread is "
				+ Thread.currentThread().getName());
		
		NameRunnable r = new NameRunnable();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		//t1.setName("Dibyendu");
		t1.start();
		//t2.setName("Baisakhi");
		t2.start();
	}

}
