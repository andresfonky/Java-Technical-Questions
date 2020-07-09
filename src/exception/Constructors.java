package exception;

// Constructors cannot be enclosed in try/catch block.
public class Constructors {
	//try {
		public Constructors() throws Exception {
			System.out.println("GeeksforGeeks");
			throw new Exception();
		}
	/*} catch(Exception e) {
		System.out.println("GFG");
	}*/
		
	public static void main(String[] args) {
		try {
			Constructors constr = new Constructors();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
