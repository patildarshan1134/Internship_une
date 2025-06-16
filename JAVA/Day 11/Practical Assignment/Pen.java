package penclasswithfileds;

public class Pen {
	String brand;
	String color;
	
	void det(String b,String c){
		brand=b;
		color=c;
	}
	
	void display() {
		System.out.print("Pen brand :"+brand);
		System.out.print("\nPen Color:"+color);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p=new Pen();
		p.det("Trimax","bluee");
		p.display();
		

	}

}
