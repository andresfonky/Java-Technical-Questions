package thread;

//After starting a thread, it can never be started again. If you does so, an
//IllegalThreadStateException is thrown. In such case, thread will run once but 
//for second time, it will throw exception.
public class OnlyOneStart extends Thread {
	public void run() {
		System.out.printf("Test ");
	}

	public static void main(String[] args) throws InterruptedException {
		OnlyOneStart test = new OnlyOneStart();
		test.run();
		test.run();
		test.start();
		test.start();
	}
}
