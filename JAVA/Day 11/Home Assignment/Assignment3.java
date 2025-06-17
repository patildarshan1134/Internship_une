//create an object of the SavingsAccount class and call the method to display the account details.
class SavingsAccount{
    String HolderName = "john Doe";
    int Number = 83623213;
    void display(){
        System.out.println("Holder Name = "+HolderName+"\nNumber = "+Number);
    }
}
public class Assignment3 {
    public static void main(String[] args) {
        SavingsAccount s =new SavingsAccount();
        s.display();
    }
    
}
