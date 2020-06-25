package staticvar;

public class MathsVar {
	
	public static double PI = 3.14;
	
	public MathsVar() {
		
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}
	
	@Override
	public boolean equals(Object m) {
		return true;
	}
}
