package thread;

public class MainClass {
	
	public static void main(String args[]){ 
        Calculator snd = new Calculator(5); 
        Calculator sn = new Calculator(3);
		CalculatorThread c1 = new CalculatorThread(25,snd);
		CalculatorThread c2 = new CalculatorThread(7,snd);
		CalculatorThread c3 = new CalculatorThread(2,sn);

		// Start two threads of ThreadedSend type
		c1.run();
		c2.run();
		c3.run();
    } 
}
