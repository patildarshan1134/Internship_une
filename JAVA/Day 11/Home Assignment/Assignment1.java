//Create an object of the Laptop class and call the displayDetails() method to display its information.
class Laptop{
    String Brand = "HP Omen";
    
    void displayDetails(){
        System.out.println("Laptop Brand = "+Brand);
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.displayDetails();
    }
    
}
