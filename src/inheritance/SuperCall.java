package inheritance;

// Constructor call to super class must be the first statement in the constructor
// of the Derived class.
// In methods, it is not to  be the first statement. super keyword is used to invoke 
// the overridden method from a child class explicitly.
class SuperBase {
	private static String c = "Private";
	protected static String s = " Super Class ";

	public SuperBase() {
		System.out.printf("1");
	}
	
	public void printText() {
		System.out.println(c);
	}
}

public class SuperCall extends SuperBase {
	public SuperCall() {
		super();
		System.out.printf("2");
		//super();
	}
	
	public void printText() {
		System.out.println("SuperCall");
		super.printText();
	}
	
	public static void main(String[] args) {
		SuperCall obj = new SuperCall();
		System.out.println(s);
		obj.printText();
	}
}