//Write a Java program to create a thread by extending the Thread class.
//  The thread should print numbers from 1 to 5 with a delay of 1 second
//  between each number.

package extendingthethreadclass;
import java.lang.Thread;
//package extendingthethreadclass;

public class Threadshouldprintnumbers extends Thread {
public	void Run() {
		try {
		
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			Thread.sleep(1000);
			}
	}catch(Exception e) {
		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadshouldprintnumbers obj=new Threadshouldprintnumbers();
		obj.start();
		
	}

}
