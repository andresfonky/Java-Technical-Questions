package primitive;

public class DefaultType {
	
	private int i;
	private float f;
	private double d;
	private String s;
	private boolean b;
	private Character c;
	private DefaultObject obj;
	
	public DefaultType() {
		
	}
	
	public String toString() {
		String s = "(Integer: " + this.i + ") (Float: " + this.f + ") (Double: " + this.d + 
				") (String: " + this.s + ") (Boolean: " + this.b + ") (Character: " + this.c + 
				") (Obj:  " + this.obj + ")";
		return s;
	}
}
