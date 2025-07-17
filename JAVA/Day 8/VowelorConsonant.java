package voweorcon;

import java.util.Scanner;				//import scanner

public class VowelorConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Alphabet:");				//print
		String a=sc.next();								//scanned input
		
		switch(a) {						//switch case for decision
		case "A": System.out.println("Its a Vowel");
		break;
		
		case "E" :System.out.println("Its a Vowel");
		break;
		
		case "I": System.out.println("Its a Vowel");
		break;
		
		case "O": System.out.println("Its a Vowel");
		break;
		
		case "U" :System.out.println("Its a Vowel");
		break;
		
		case "a": System.out.println("Its a Vowel");
		break;
		
		case "e": System.out.println("Its a Vowel");
		break;
		
		case "i":System.out.println("Its a Vowel:");
		break;
		
		case "o": System.out.println("Its a Vowel");
		break;
		
		case "u": System.out.println("Its a Vowel:");
		break;
		
		default : System.out.println("Its a Consonent:");
		break;
		}
	}

}
