package gradeusingswitch;

import java.util.Scanner;				//scanner import

public class GradeusingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);       //scanner obj
		System.out.print("Enter the Grade:");				//print
		String x=sc.next();				//scanned element from user
		
		switch(x) {				//Switch case for decision making 
		case "A": System.out.println("Excellent:");
		break;
		
		case "B":System.out.println("Good:");
		break;
		
		case "C": System.out.println("Average:");
		break;
		
		case "D": System.out.println("Below Average:");
		break;
		
		case "F": System.out.println("Fail");
		break;
		
		case "a": System.out.println("Excellent:");
		break;
		
		case "b":System.out.println("Good:");
		break;
		
		case "c": System.out.println("Average:");
		break;
		
		case "d": System.out.println("Below Average:");
		break;
		
		case "e": System.out.println("Fail");
		break;
		
		default :  System.out.println("Fail");
		break;
		}
	}

}
