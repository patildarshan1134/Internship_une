package divideby5or11;

import java.util.Scanner;			//import scanner

public class Divideby5or11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to check whether its divisible by 5 or 11:"); 				//print
		int a=sc.nextInt();				//scanned object
		
		if(a%5==0 && a%11==0) {				//if else statement for cheaking no
			System.out.println(a+" Is divisible by 5 and 11.");
		}else {
			System.out.println (a+" Is not divisible by 5 and 11.");
		}

	}

}
