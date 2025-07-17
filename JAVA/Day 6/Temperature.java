package temperature;
import java.util.*;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature:");
		int a=sc.nextInt();
		
		if(a>35) {

			System.out.println("Hot Day");

		}
		else {
			System.out.println("Cold Day");
		}

	}

}
