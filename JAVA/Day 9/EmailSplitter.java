package emailSplitter;

public class EmailSplitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "sunny121@gmail.com";
        String[] parts = email.split("@");

    
            System.out.println("Username: " + parts[0]);
            System.out.println("Domain: " + parts[1]);
       
           
	}

}
