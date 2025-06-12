package splitsentence;

public class Splitsentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello everybody its sunny here:";
		String[] a=s.split("");
		
		System.out.println("Words are:");
		for(String as:a) {
			System.out.println(as);
		}
	}

}
