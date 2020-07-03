package inheritance;

class Gamma {
	public String type = "c ";

	public Gamma() {
		System.out.print("gamma ");
	}
}

class Alpha extends Gamma {
	public String type = "a ";

	public Alpha() {
		System.out.print("alpha ");
	}
}

public class VariableInheritance extends Alpha {
	public String type = "j"; 
	public VariableInheritance() {
		System.out.print("beta ");
	}

	void go() {
		type = "b ";
		System.out.print(this.type + super.type);
	}

	public static void main(String[] args) {
		new VariableInheritance().go();
	}
}
