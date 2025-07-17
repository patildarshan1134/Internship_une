package multiplearithmeticoperationstrycatchfinally;

public class Multipleoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int i=10,j=8;
	System.out.println(i+j);
	System.out.println(i-j);
	System.out.println(i*j);
	System.out.println(i/j);
}catch(Exception e) {
	System.out.println(e.getMessage());
	}
finally {
	System.out.println("your are in final block");
}
	}

}
