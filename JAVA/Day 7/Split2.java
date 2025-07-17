package split2;

public class Split2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input string
		String s="101,Ravi,78,85,90";
		
		//taking higher limit
		String[] arr=s.split(",",5);
		
		for(String a: arr)
			System.out.println(a);
		
	}

}
