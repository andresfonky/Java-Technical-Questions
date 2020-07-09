package inheritance;

//The overriding method can not have more restrictive access modifier
class DerivedRestricted {
	public void getDetails() {
		System.out.println("Derived class");
	}
	
	protected void printText() {
		System.out.println("Derived text");
	}
}

public class RestrictiveMethod extends DerivedRestricted {

	// protected > public -> Error
	/*protected void getDetails() {
		System.out.println("Restrictive class");
	}*/
	
	// public < protected -> Ok
	public void printText() {
		System.out.println("Restrictive text");
	}
	
	public static void main(String[] args) {
		DerivedRestricted obj = new RestrictiveMethod(); // line xyz
		obj.getDetails();
		obj.printText();
	}
}
