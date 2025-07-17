package synchronizeaccesstoasharedresource;
class Demo{
	void run()
	{
		System.out.println("Hellooo method 1st");
	}
}
public class Synchronizeaccessreal extends Thread {
Demo s;
public Synchronizeaccessreal(Demo s) {
	this.s=s;
	
}
public void run() {
	s.run();
	System.out.println("\n not Synchronized method ");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo s=new Demo();
Synchronizeaccessreal t=new Synchronizeaccessreal(s);
t.start();
	}

}
