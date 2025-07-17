//2. Write a Java program where a class implements the Runnable interface and
//    prints "Hello from thread!" five times.


package runnableinterface;
import java.lang.Thread;
public class Runnableinterface implements Runnable {

	public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Sunny's thread!");
        }
    }

    public static void main(String[] args) {
    	Runnableinterface hr = new Runnableinterface();
        Thread t = new Thread(hr);
        t.start();
   

	}

}
