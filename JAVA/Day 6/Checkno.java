package checkno;
import java.util.*;


public class Checkno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();				//scanned input from user
		
		if (a>0) {
			System.out.println("No is positive"); //a is greater then 0 then print
		}else if(a<0){
			System.out.println("No is negative");		//a is smaller then 0 then print
		}else {
			System.out.println("No is zero");		//a is not big or not small then 0 then print
		}
		
		

	}

}
