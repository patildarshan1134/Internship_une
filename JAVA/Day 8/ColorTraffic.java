package trafficswitch;

import java.util.*;			//import scanner

public class ColorTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Traffic Color:"); 				//print
		String a=sc.nextLine();								//scanned input
		
		switch(a) { 				//switch case for decision
		case "GREEN": System.out.println("GO:");
		break;
		
		case "RED" :System.out.println("Stop:");
		break;
		
		case "YELLOW": System.out.println("Ready to GO:");
		break;
		
		case "green": System.out.println("GO:");
		break;
		
		case "red" :System.out.println("Stop:");
		break;
		
		case "yellow": System.out.println("Ready to GO:");
		break;
		
		default :System.out.println("Invalid color");
		break;
		
		
		
		}

	}

}
