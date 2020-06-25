package staticvar;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(MathsVar.PI);
		
		MathsVar m = new MathsVar();
		m.setPI(5);
		MathsVar v = new MathsVar();
		System.out.println(v.getPI());
		
		v.setPI(3.1421);
		System.out.println(m.getPI());
		System.out.println(MathsVar.PI);
		
		System.out.println(v.equals(m));
	}

}
