package Logical;
import java.util.*;

public class Logic {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		       
		        System.out.print("Enter marks: ");
		        int marks = sc.nextInt();

		        
		        if (marks >= 0 && marks <= 100) { 
		            if (marks > 40) {
		                System.out.println("Student has passed.");
		            } else {
		                System.out.println("Student has failed.");
		            }
		        } else {
		            System.out.println("Invalid marks entered.");
		        }
	}

		        sc.close();
		    


	}

}
