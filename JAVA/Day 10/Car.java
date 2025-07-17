package vehicleinheritance;


class Vehicle {
    void start() {
        System.out.print("Vehicle:  ");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println(" You are in Bike class now ");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println(" You are in Car class now ");
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub

        Bike b = new Bike();
        b.start();
        b.ride();

        Car c = new Car();
        c.start();
        c.drive();



	}

}
