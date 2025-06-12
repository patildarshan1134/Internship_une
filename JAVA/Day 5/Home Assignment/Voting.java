package voting;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int a=sc.nextInt();
		
		if(a>=18) {
			System.out.println("YOU ARE ELIGIBLE FOR VOTE");
		}else {
			System.out.println("YOU ARE NOT ELIGIBLE FOR VOTE:");
		}
	}

}
