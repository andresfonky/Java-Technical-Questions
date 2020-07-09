package basic.primitive;

public class Conversion {
	public static void main(String[] args) {
		int value = 554;
		//String var = (String) value;
		String var = String.valueOf(value);
		String temp = "123";
		//int data = (int) temp;
		int data = Integer.valueOf(temp);
		System.out.println(data + var);
		
		double dou = 444.324; 
        int val = (int) dou; 
        System.out.println(val); 
        
        double x = 444.324; 
        int y = 9; 
        float z = 5.1f;
        System.out.println(x + y + z); //double wins
        
        byte a = 1; 
        //a = (byte) a * 0; Compilation error because the expression on the right side has data type as int whereas left side it is byte.
        byte b = (byte) (a * 0); //line 2 
        System.out.println(a); 
	}
}
