package basic;

import java.text.DateFormat;
import java.util.Date;

// Operations with primitive values
public class PrimitivesOperations {
	public static void main(String args[]) {
		char c;
		int i;
		c = 'A'; // 1
		i = c; // 2
		System.out.println(i);
		c = (char) (i + 1); //3
		System.out.println(c);
		c++; //4
		System.out.println(c);
		
		Date d = new Date(2011343412345L);
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(d));
		
		int j = (int) Math.floor(9.8);
		System.out.println(j);
	}
	
	public double getData(byte a, double z) {
		return (short)a/z * 10;
	}
}
