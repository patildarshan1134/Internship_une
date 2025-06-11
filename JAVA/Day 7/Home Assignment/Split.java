package split3;



public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
String s="Hello?How are you?Good!";
		
		//taking higher limit
		String[] arr=s.split("\\?\\s*");
		
		for(String a: arr)
			System.out.println(a);

	}

}
