package swapping;

public class swap {

	
	void swapvar() {
		
		int a=21;
		int b=22;
		
		
		System.out.println("Beforee swapping : a="+a+"b=:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping : a="+a+"b=:"+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swap obj=new swap();
		obj.swapvar();

	}

}
