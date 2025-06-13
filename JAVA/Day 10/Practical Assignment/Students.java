package studentsclassobj;

public class Students{
	
	int age=21;
	String name="Sunny";
	String field="Information technology";
	void ad() {
	System.out.println("Student name is:"+name+"\nAge is :"+age+"\nField is:"+field);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students();
		s.ad();

	}

	}
