package bit;

import java.util.Scanner;

public class Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("And operator"+(a&b));
		System.out.println("OR operator"+(a|b));
		System.out.println("XOR operator"+(a^b));
	}

}
