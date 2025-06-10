package splitbyuser;
import java.util.*;    //package import

public class Splitbyuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");  //input taking
		String a=sc.nextLine();					//scanned
		
String[] arr=a.split(" ");			////taking higher limit
		
		for(String b: arr)
			System.out.println(b);

	}

}
