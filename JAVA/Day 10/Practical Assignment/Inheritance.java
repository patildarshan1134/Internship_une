package inheritancepeopleandemployee;

class Person {
	    String name;
	    int age;

	    Person(String n, int a) {
	        name = n;
	        age = a;
	    }
	}

	class Employee extends Person {
	    double salary;

	    Employee(String n, int a, double s) {
	        super(n, a);
	        salary = s;
	    }

	    void display() {
	        System.out.println("Name: " + name + ", Age: " + age + ", Salary: ₹" + salary);
	    }

	    public static void main(String[] args) {
	    	// TODO Auto-generated method stub
	        Employee emp = new Employee("Sunny",21,500000);
	        emp.display();
	    }

		

	}

}
