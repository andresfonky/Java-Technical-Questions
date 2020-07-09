package inheritance;

// You can access shadowed variables from superclasses of superclasses by casting this
interface I {
	int x = 0;
}

class GrandpaVar implements I {
	int x = 1;
}

class ParentVar extends GrandpaVar {
	int x = 2;
}

public class ParentVariables extends ParentVar {
	int x = 3;

	void test() {
		System.out.println("x=\t\t" + x);
		System.out.println("super.x=\t" + super.x);
		System.out.println("((T2)this).x=\t" + ((ParentVar) this).x);
		System.out.println("((T1)this).x=\t" + ((GrandpaVar) this).x);
		System.out.println("((I)this).x=\t" + ((I) this).x);
	}

	public static void main(String[] args) {
		new ParentVariables().test();
	}
}
