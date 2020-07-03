package basic;

public class StaticInitialization {

	Gfg a = new Gfg(); // line 8
	static Gfg c = new Gfg();

	public static void main(String args[]) {
		Gfg b; // line 12
		b = new Gfg();
		//StaticInitialization s = new StaticInitialization();
	}
}

class Gfg {
	// constructor
	Gfg() {
		System.out.println("Geeksforgeeks");
	}
}
