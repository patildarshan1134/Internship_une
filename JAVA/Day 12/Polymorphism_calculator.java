//polymorphism class

package calculatorclassdemonstrate;

public class Polymorphism_calculator {
	
	int add(int x,int y) {
		return x + y;
	}

	int add(int x,int y,int z) {
		return x + y +z;
	}
	

	double add(double x,double y) {
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_calculator obj = new Polymorphism_calculator();

		System.out.println("Addition of two integer no is:"+obj.add(21,32));
		System.out.println("Addition of three integer  no is:"+obj.add(12,23,22));
		System.out.println("Addition of two double no is:"+obj.add(21.21,13.21));
		}

}
