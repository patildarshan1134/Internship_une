package animalsound;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat1 extends Animal {
   
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Cat {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat1();


        a1.makeSound();
        a2.makeSound();

	
		// TODO Auto-generated method stub

	}

}
