package inheritance;

abstract class demo {
	public int a;

	demo() {
		a = 10;
	}

	abstract public void set();

	// Abstract method has to be overridden, cannot be final
	abstract /* final */ public void get();
}

public class AbstractClass extends demo {

	// Number of parameters different from parent, no overridden
	public void set(int a) {
		this.a = a;
	}

	@Override
	public void set() {
	}
	
	@Override
	final public void get() {
		System.out.println("a = " + a);
	}

	public static void main(String[] args) {
		AbstractClass obj = new AbstractClass();
		obj.set(20);
		obj.get();
	}
}