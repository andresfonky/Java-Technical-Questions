package thread;

public class CalculatorThread extends Thread { 
    private int x; 
    private Calculator c; 
  
    CalculatorThread(int m, Calculator obj) { 
        this.x = m; 
        this.c = obj; 
    } 
  
    public void run() { 
        //synchronized(this.c) {
            try {
				this.c.sum(this.x);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
        //}
    } 

}
