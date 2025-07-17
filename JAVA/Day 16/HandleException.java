
import java.util.*;
public class HandleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        try {
	            System.out.print("Enter first number for division: ");
	            int num1 = sc.nextInt();

	            System.out.print("Enter second number for division: ");
	            int num2 = sc.nextInt();

	            int result = num1 / num2;
	            System.out.println("Result: " + result);
	        } 
	        catch (Exception e) 
	        {
	            System.out.println("Error: Cannot divide by zero.");
	        } 
	        sc.close();
	}
}
	         
