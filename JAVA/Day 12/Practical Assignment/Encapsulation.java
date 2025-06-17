package encapsulationStudent;
class Student {
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        if(age > 0)
            this.age = age;
    }
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.getName();
		s.setName("Sunnny");
		s.getAge();
		s.setAge(19);
		
		System.out.println("Name is :"+s.getName());
		System.out.println("Age is :"+s.getAge());

	}

}
