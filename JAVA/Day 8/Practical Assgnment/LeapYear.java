package leapyear;

import java.util.Scanner;    		//scanner import

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");		//print
		int a=sc.nextInt();					//scanned elements
		
		if((a%4==0 && a%100!=0)||(a%400==0) ){ //for loop for decison
			System.out.println("Its a leap year:");
			
		}else {
			System.out.println("Not a leap year:");
		}
	}

}
