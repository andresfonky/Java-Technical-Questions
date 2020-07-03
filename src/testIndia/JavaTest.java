package testIndia;

//https://www.indiabix.com/online-test/java-programming-test/random
public class JavaTest {
	
	public static void main(String args[]) {
		String d = "bookkeeper";
		d.substring(1,7);
		d = "w" + d;
		//d.append("woo");  /* Line 4 */
		System.out.println(d);
		
		String a = "ABCD"; 
		String b = a.toLowerCase(); 
		b.replace('a','d'); 
		b.replace('b','c'); 
		System.out.println(b);
		
		System.out.println(Math.sqrt(-4D));
		System.out.println(Math.random());
		
		try {
			System.out.print("Hello world ");
		} finally {
			System.out.println("Finally executing ");
		}
		
		s run = new s();
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		t1.start();
		t2.start();
		
		int i = 2, j = 0;
		switch (i) {
			case 4:
				j += 6;
			case 2:
				j += 1;
			default:
				j += 2;
			case 0:
				j += 4;
		}
		System.out.println("j = " + j);
	}
	
	public static class s implements Runnable {
		int x, y;

		public void run() {
			for (int i = 0; i < 1000; i++)
				synchronized (this) {
					x = 12;
					y = 12;
				}
			System.out.print(x + " " + y + " ");
		}

	}
}
