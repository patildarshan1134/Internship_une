package handlezerousingtrycatchblock;

public class trycatchhforzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 100, b = 0;
	        try {
	            int result = a / b;
	            System.out.println("Result: " + result);
	        } catch (Exception e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        }
	    

	}

}
