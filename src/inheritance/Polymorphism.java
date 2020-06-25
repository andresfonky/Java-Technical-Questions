package inheritance;

public class Polymorphism {
	

	public static void main(String[] args) {
		Audi b = new Audi(5, "A4");    //upcasting
		b.run();
		b.setId(456);
		System.out.println("b: " + b.getId());
		
		Car c = new Audi(5, "A");
		c.setId(789);
		System.out.println("c: " + c.getId());
		System.out.println("b: " + b.getId());
		
		System.out.println(c.equals(b));
		
		b.doNothing("S", 2);
		b.doNothing(2, "S");
		
		System.out.println(b.calculate(2, 3));
		b.calculate(2);
	}
}
