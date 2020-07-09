package basic.primitive;

//Comparing Integer Object
//Integer is different than int, it is an object, so to compare, we have 
//to use equals
public class CompareInteger {
	
	public static void main(String[] args) {
		Integer a = 128, b = 128;
		System.out.println(a == b);
		System.out.println(a.equals(b));

		Integer c = 100, d = 100;
		System.out.println(c == d);
	}
}
