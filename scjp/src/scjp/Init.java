package scjp;

class Init {
	//Integer x = Integer.valueOf("20000.00",2);
	
	//static int xy =20;
	
   static String s = Integer.toHexString(20000);
   
   
	
	Init(int x) {
		System.out.println("1-arg const");
	}

	Init() {
		System.out.println("no-arg const");
	}

	static {
		System.out.println("1st static init");
	}
	{
		System.out.println("1st instance init");
	}
	{
		System.out.println("2nd instance init");
	}
	static {
		System.out.println("2nd static init");
	}

	public static void main(String[] args) {
		System.out.println(Init.s);
		new Init();
		new Init(7);
		System.gc();
		
	}
}