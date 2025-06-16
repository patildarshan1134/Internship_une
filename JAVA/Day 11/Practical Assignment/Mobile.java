package mobileclass;

public class Mobile {
	String model;
	double price;
	
	void details(String m,double p) {
		model=m;
		price=p;
		
	}
	void display() {
		System.out.print("\nModel :"+model+"\nPrice :"+price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile m1=new Mobile();
Mobile m2=new Mobile();

m1.details("Samsung",1224335);
m2.details("Redmi",1234322);

m1.display();
m2.display();
	}

}
