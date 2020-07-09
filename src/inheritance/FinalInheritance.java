package inheritance;

// Although a final method cannot be overridden, 
// in this case, the method is private, and therefore hidden. 
// The effect is that a new, accessible, method flipper is created. 
// Therefore, no polymorphism occurs in this example, 
// the method invoked is simply that of the child class, and no error occurs.
class ParentFinal {
	private final void flipper() {
		System.out.println("Parent-Flipper");
	}
	
	public final void print() {
		System.out.println("Parent");
	}
}

public class FinalInheritance extends ParentFinal {
	// Parent method is private, so cannot be seen
	public final void flipper() {
		System.out.println("Child-Flipper");
	}
	
	// Parent method is final, so cannot be overridden
	/*public final void print() {
		System.out.println("Child");
	}*/

	public static void main(String[] args) {
		new FinalInheritance().flipper();
		new ParentFinal().print();
		new FinalInheritance().print();
	}
}
