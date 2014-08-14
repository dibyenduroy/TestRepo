package scjp;

class NameRunnable1 implements Runnable {
	public void run(){
		for (int x = 1; x <= 3; x++) {
			Thread.currentThread().setPriority(1);
			System.out.println("Run by "
			+ Thread.currentThread().getName()
			+ ", x is " + x + "The Thread Priority is" +Thread.currentThread().getPriority());
			
			
		try {
			Thread.sleep(2000);
		} catch(InterruptedException ex) {
			
		}
			
			}
	}
}


public class ManyNames {
	
	public static void main(String [] args) {
		NameRunnable1 nr = new NameRunnable1();
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		
		one.setName("Tonny");
		two.setName("Jonny");
		three.setName("Ponny");
		
		one.start();
		
		
		two.start();
		three.start();
		//one.start();
		
	}

}
