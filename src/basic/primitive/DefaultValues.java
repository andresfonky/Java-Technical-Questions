package basic.primitive;

// Default value of primitives and objects
public class DefaultValues {
	public static void main(String[] args) {
		DefaultType t = new DefaultType();
		System.out.println(t.toString());

		Integer a = 128, b = 128;
		System.out.println(a == b);
		System.out.println(a.equals(b));

		Integer c = 100, d = 100;
		System.out.println(c == d);
	}
}
