package scjp;

public class Propagate {

	public static void main (String [] args) {
		
		try {
			System.out.println("The Reversed String is : " + reverse("USA"));
		} catch (Exception e) {
			System.out.println("The String Length is 0");
			//e.printStackTrace();
		} finally {
			System.out.println("The String Length is 0");
		}
		
	}
	
	 static String reverse (String s) throws Exception  {
	Exception test1 = new Exception();
	 assert(s.length()>0);
		if(s.length()==0) {
			throw  test1;
		}
		
		String reverseorder = "";
		int x = s.length();
		for (int i=x-1; i>=0;--i) {
			reverseorder+=s.charAt(i);
		}
		
		return reverseorder;
	}
	
}
