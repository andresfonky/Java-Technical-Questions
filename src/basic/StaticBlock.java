package basic;

public class StaticBlock {
	public static void main(String args[]) {
		SB a = new SB();
		System.out.println("Value of num = " + SB.num);
		System.out.println("Value of mystr = " + SB.mystr);
	}
}

class SB {
	static int num;
	static String mystr;

	// constructor
	SB() {
		num = 100;
		mystr = "Constructor";
	}

	// First Static block
	static {
		System.out.println("Static Block 1");
		num = 68;
		mystr = "Block1";
	}

	// Second static block
	static {
		System.out.println("Static Block 2");
		num = 98;
		mystr = "Block2";
	}
}