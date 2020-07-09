package inheritance;

class DerivedInheritance {
	//Since the method multiplier is marked as private, it isn’t inherited and 
	//therefore is not visible to the Derived.
	/*private*/ public int multiplier(int data) { 
		return data * 5;
	}
}

public class PrivateInheritance extends DerivedInheritance {
	private static int data;

	public PrivateInheritance() {
		data = 25;
	}
	
	public static void main(String[] args) {
		PrivateInheritance temp = new PrivateInheritance();
		System.out.println(temp.multiplier(data));
	}

}
