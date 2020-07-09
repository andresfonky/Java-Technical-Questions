package inheritance;

// Parent Constructor cannot be private because super call cannot reach it.
class PrivateAlpha{
	static String s = " ";

	/*private*/ protected PrivateAlpha() {
		s += "alpha ";
	}
}

public class PrivateConstructor extends PrivateAlpha {

	private PrivateConstructor() {
		s += "contructor ";
	}

	public static void main(String[] args) {
		new PrivateConstructor();
		System.out.println(s);
	}
}