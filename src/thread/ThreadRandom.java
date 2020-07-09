package thread;

//From the statement “thread.start()”, we have two threads Main thread and “thread” thread. 
// So either “GFG” can be printed or “Geeks”, depend on which thread, thread scheduler schedule.
public class ThreadRandom implements Runnable {
	public void run() {
		System.out.printf("GFG ");
		System.out.printf("Geeks ");
	}

	public static void main(String[] args) {
		ThreadRandom obj = new ThreadRandom();
		Thread thread = new Thread(obj);

		thread.start();
		System.out.printf("Geeks ");
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("for ");
	}
}