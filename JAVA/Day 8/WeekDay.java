package weekday;

import java.util.Scanner; 				//scanner imported

public class WeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no from 1 to 7:"); 				//print
		int a=sc.nextInt();								//scanned input
		
		switch(a) { 				//switch case for decision
		case 1: System.out.println("Monday:");
		break;
		
		case 2 :System.out.println("Tuesday:");
		break;
		
		case 3: System.out.println("Wednesday:");
		break;
		
		case 4: System.out.println("Thursday:");
		break;
		
		case 5 :System.out.println("Friday:");
		break;
		
		case 6: System.out.println("Saturday:");
		break;
		
		case 7: System.out.println("Sunday:");
		break;
		
		default : System.out.println("INVALID INPUT NO SHOULD BE IN 1-7:");
		break;
		}
	}

}
