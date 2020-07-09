package basic;

// When static objects are initialized
public class StaticInitialization {

	Gfg a = new Gfg(); // Not printed
	static Gfg c = new Gfg();

	public static void main(String args[]) {
		Gfg b; // line 12
		b = new Gfg();
	}
}

class Gfg {
	// constructor
	Gfg() {
		System.out.println("Geeksforgeeks");
	}
}
