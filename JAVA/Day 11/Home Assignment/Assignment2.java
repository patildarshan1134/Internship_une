
class Product{
String Name;
int price;

    public Product(String Name,int price) {
        this.Name=Name;
        this.price=price;
    }
 
    void displayDetails(){
        System.out.println("Name = "+Name+"\nPrice = "+price);
    }


}


public class Assignment2 {
    public static void main(String[] args) {
        Product p = new Product("mobile", 68953);
        p.displayDetails();
        Product p1 =new Product("mobile", 37435);
        p1.displayDetails();
    }
    
}
