package togglelastbit;
import java.util.*;

public class Toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number:");		 //input from user
		int a=sc.nextInt();								// scanned input
		int b=a^1;					//converting by ^1
		
		System.out.println("Normal integer is:"+a);			//normal Entered no
		System.out.println("Value after ^1 is :"+b);		//toggled no by ^1

	}

}
