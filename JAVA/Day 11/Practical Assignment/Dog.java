package animalanddog;
class Animal {
    void eat() {
        System.out.println("Animal is eating....");
    }
}

public class Dog extends Animal {
	 void bark() {
	        System.out.println("Dog is barking.... Bhaww Bhawww");
	    }

	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Dog d = new Dog();
	        d.eat();   // inherited method
	        d.bark();

	}

}
