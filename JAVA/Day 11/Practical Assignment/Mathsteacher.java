package teacherandmathsteacher;
class Teacher {
    String name;
    String subject;

    Teacher(String n, String s) {
        name = n;
        subject = s;
    }
}


public class Mathsteacher extends Teacher{
	 int experienceYears;

	    Mathsteacher(String n, String s, int y) {
	        super(n, s); // calling base class constructor
	        experienceYears = y;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Subject: " + subject);
	        System.out.println("Experience: " + experienceYears + " years");
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Mathsteacher mt = new Mathsteacher("Mrs. Patil", "Mathematics", 10);
	        mt.display();
	    }

	}


