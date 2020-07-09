package basic;

// Adding
public class AndOperatorSum {
	public static void main(String[] args) {
		int temp = 9;
		int data = 8;
		// 9 = 1001
		// 8 = 1000
		// & = 1000 (1&1 = 1, 1&0 = 0, 0&1 = 0)
		System.out.println(temp & data);
	}
}
