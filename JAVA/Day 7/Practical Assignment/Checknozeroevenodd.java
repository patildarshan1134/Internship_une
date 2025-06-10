package checknozeroevenodd;

import java.util.Scanner;    		//package import

public class Checknozeroevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");		//input
		int a=sc.nextInt();				//input scanned
		
		if(a==0) {   		//if condition 
			System.out.println(+a+"  Number is Zero");
		}else if(a%2==0) {
			System.out.println(+a+"  Number is Even");
		}else {
			System.out.println(+a+"  Number is Odd");
		}		//end of loop

	}

}
