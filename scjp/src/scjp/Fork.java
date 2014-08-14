package scjp;

class Fork {
	public static void main(String[] args) {
		if (args.length == 1 | args[0].equals("test")) {
			System.out.println("test case");
		} else {
			System.out.println("production " + args[1]);
		}
	}
}