package employeeclasswithdisplayinfo;

public class Employee {
	
	    String name = "Sunny";
	    int id = 121;

	    void displayInfo() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee ID: " + id);
	    }

	    public static void main(String[] args) {
	    	// TODO Auto-generated method stub
	        Employee e = new Employee();
	        e.displayInfo();
	    }
	

	}


