package basic;

// x = 3 -> x-- = 3 (but now x=2)
// x = 2 -> --x = 1
public class Operations {
	public static void main(String[] args) {
		int x = 3;
		System.out.println(x-- + " (" + x + ")");
		System.out.println(--x + " (" + x + ")");		
		
		System.out.println();
		int value = 3, sum = 6 + --value;
		
		int data = --value + ++value / sum++ * value++ + ++sum % value--;
		//sum = 8
		// 1 + 2 / 8 * 2 + 10 % 3
		// 1 + 0 * 2 + 1
		// 1 + 0 + 1
		System.out.println(data);
	}
}