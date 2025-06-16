package devicesmartphoneandtablet;
class Device {
    void powerOn() {
        System.out.println("Device is powering on...");
    }
}

class Smartphone extends Device {

    void powerOn() {
        System.out.println("Smartphone is booting up...");
    }
}

public class Tablet extends Smartphone {
	 void powerOn() {
	        System.out.println("tablet is booting up...");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	        Device dt = new Device();
	        Smartphone sp = new Smartphone();
	        Tablet tb = new Tablet();
	        
	       
	        dt.powerOn();
	        sp.powerOn();
	        tb.powerOn();

	}

}
