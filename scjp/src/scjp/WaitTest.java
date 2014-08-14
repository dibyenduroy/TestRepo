package scjp;

public class WaitTest {
	public static void main(String [] args) {
		System.out.print("1 ");
		synchronized(args){
			System.out.print("2 ");
			try {
				//args.wait();
				args.wait(1000);
				
			}catch(InterruptedException e) { args.notifyAll();}
		}
		
		System.out.print("3 ");
	}

}
