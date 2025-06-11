package expression3;

import java.util.Scanner;

public class Expression3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 5 Elements:");
		int a=sc.nextInt();		// scanning 5 elements
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		System.out.println("THE logical Evaluation by \n this formula is[(a+b)*(c-d)/e]  :"+((a+b)*(c-d))/e);  			// printing elements by using formula


	}

}
