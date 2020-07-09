package thread;

// An object must first acquire a lock before calling wait() method. 
// Also wait() method throws Checked exception(InterruptedException),
// we must include it in a try-catch block or throws it.
class myThread implements Runnable {
	public void run() {
		//synchronized (ThreadWait.obj) {
			ThreadWait.obj.notify();
		//}
	}
}

public class ThreadWait implements Runnable {
	public static ThreadWait obj = new ThreadWait();
	private int data;

	public ThreadWait() {
		data = 10;
	}

	public void run() {
		//synchronized (obj) {
			try {
				obj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		//}
		obj.data += 20;

		System.out.println(obj.data);
	}

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new ThreadWait());
		Thread thread2 = new Thread(new myThread());

		thread1.start();
		thread2.start();

		System.out.printf(" GFG - ");
	}
}
