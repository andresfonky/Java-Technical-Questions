package thread;

public class Calculator  {
	
	private int x;
	
	public Calculator(int x) {
		this.x = x;
	}
	
	public void sum(int j) throws InterruptedException {
		for(int i = 0; i<j; i++) {
			//System.out.println(j);
			Thread.sleep(100);
		}
		x = j;
		System.out.println(x);
	}
}
