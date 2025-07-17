package abstractionbankclass;
abstract class Bank {
	abstract double getintrestrate();
}

class SBI extends Bank{
	 double getintrestrate() {
		return 8.8;
	}
}
class HDFC extends Bank{
	 double getintrestrate() {
		return 9.2;
	}
}

public class BankSBIandHDFC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank SBI =new SBI();
		Bank HDFC = new HDFC();
		
System.out.println("The Rate of intrest given by SBI bank is :  "+SBI.getintrestrate()+"%");
System.out.println("The Rate of intrest given by HDFC bank is : "+HDFC.getintrestrate()+"%");		

	}

}
