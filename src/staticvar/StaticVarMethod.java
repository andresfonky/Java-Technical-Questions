package staticvar;

//static variables are associated with the class and are therefore, 
//not allowed inside a method body.
public class StaticVarMethod {
	public static float sum;
	
	private float temp() {
		/*public static float*/ sum = 21;
		return (--(sum));
	}

	public static void main(String[] args) {
		StaticVarMethod test = new StaticVarMethod();
		System.out.println(test.temp());
	}
}