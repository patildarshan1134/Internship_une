package evenoddif;

import java.util.Scanner;				//import scanner

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 		 // scanner obj
		System.out.println("Enter the year:");			//print the message
		int a=sc.nextInt(); 							 //scanned elements
		
		if(a%2==0) { 				//if loop for decision
			System.out.println("Its a Even no:");	
		}else {
			System.out.println("Its a Odd number:");
		}
	}

}
