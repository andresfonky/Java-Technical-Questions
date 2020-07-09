package other;

public class MethodOverloading {

	// In this case of method Overloading, the most specific method is
	// choosen at compile time. As ‘java.lang.String’ and ‘java.lang.Integer’ is
	// a more specific type than ‘java.lang.Object’,but between ‘java.lang.String’
	// and ‘java.lang.Integer’ none is more specific.
	// In this case the Java is unable to decide which method to call.

	public static void gfg(String s) {
		System.out.println("String");
	}

	/*
	 * public static void gfg(Integer i) { System.out.println("Integer"); }
	 */

	public static void gfg(Object o) {
		System.out.println("Object");
	}
	
	private static void function(short i, short f) {
		System.out.println("Short");
	}
	
	private static void function(int i, int f) {
		System.out.println("Int");
	}
	
	private static void function(long i, long f) {
		System.out.println("Long");
	}
	
	private static void function(float i, float f) {
		System.out.println("Float");
	}

	private static void function(float i, int f) {
		System.out.println("FloatInt");
	}
	
	private static void function(double i, double f) {
		System.out.println("Double");
	}

	public static void main(String args[]) {
		gfg(null);
		function((short) 0, (short) 0); //Short
		function(0, (short) 0); //Int
		function(0, 0); //Int
		function(0, 0L); //Long
		//function(0L, 0); //Error -> Long vs FloatInt
		function(0f, 0); //FloatInt
		function(0, 0f); //Float
		function(0.0, 0); //Double
		function(0.0, 0f); //Double
	}
}
