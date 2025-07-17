package currencysymbol;

import java.util.Scanner; 		//imporrt scanner

public class Currencysymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Currency code( INR , USD , EUR , GBP ):"); 				//print
		String a=sc.nextLine().toUpperCase();		//scanned input & converting to upper case
		
		
		switch(a) { 				//switch case for decision
		case "INR": System.out.println(" Currency SYMBOL IS ₹:");
		break;
		
		case "USD" :System.out.println(" Currency SYMBOL IS $:");
		break;
		
		case "EUR": System.out.println(" Currency SYMBOL IS €:");
		break;
		
		case "GBP": System.out.println(" Currency SYMBOL IS £:");
		break;
		
		default : System.out.print("Invalid currency Code");
		break;
		}
 sc.close();
	}

}
