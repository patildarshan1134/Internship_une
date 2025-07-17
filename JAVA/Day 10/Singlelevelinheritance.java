package singlelevelinheritance;

	class Animal {
	    void sound() {
	        System.out.println("You are in Animal class");
	    }
	}

	class Dog extends Animal {
	    void bark() {
	        System.out.println("         & \nThis is How the Dog barks: Bhowww Bhoowww!!!");
	    }
	}
	public class Singlelevelinheritance {
	    public static void main(String[] args) {
	    	// TODO Auto-generated method stub
	        Dog d = new Dog();
	        d.sound();  // Calling parent method
	        d.bark();   // Calling child method


	    }

	}


