package scjp;

public class Frog2 {
	
	int frogSize = 0;
	
	public int getFogsize() {
		return frogSize;
	}
	
	public Frog2(int s) {
		frogSize =s;
	}
	public static void main (String [] args) 
	
	{
		
    Frog2 f = new Frog2(25);
    Frog2 f2 = new Frog2(30);
    System.out.println(f.getFogsize());
    System.out.println(f2.getFogsize());

    }

     

	

}
