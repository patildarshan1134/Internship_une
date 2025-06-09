package split.java;
import java.util.*;

public class Split {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the sentence:");
		String sen=sc.nextLine();
		
		String[] words=sen.split("");
		
		for(String word:words) {
			System.out.println(word);
		}
	

	}

}
