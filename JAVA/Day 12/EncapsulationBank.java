package encapsulationBankacc;
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
     
            balance += amount;
            System.out.println("Deposited: " + amount);
        } 

    public void withdraw(double amount) {
        if ( amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Chukichi pocess kru nyy!!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class EncapsulationBank  {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("9518377707");
        acc.deposit(23000);
        acc.withdraw(12000);
        System.out.println("Balance: " + acc.getBalance());
    }

}


