package swaptwo1;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int x = 10, y = 20;

	        System.out.println("Before swapping: x = " + x + ", y = " + y);

	        x = x + y;
	        y = x - y;
	        x = x - y;

	        System.out.println("After swapping: x = " + x + ", y = " + y);


	}

}
