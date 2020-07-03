package inheritance;

public class StaticInheritance {
	//Since the method multiplier is marked as private, it isn’t inherited and 
	//therefore is not visible to the Derived.
	/*private*/ public int multiplier(int data) { 
		return data * 5;
	}
}

class Derived extends StaticInheritance {
	private static int data;

	public Derived() {
		data = 25;
	}
	
	public static void main(String[] args) {
		StaticInheritance temp = new Derived();
		System.out.println(temp.multiplier(data));
	}

}
