package booktwoobject;

public class Book {

	  String title;
	    String author;

	    Book(String t, String a) {
	        title = t;
	        author = a;
	    }

	    void display() {
	        System.out.println("Title: " + title + "  & Author is: " + author);
	    }

	    
	    
	    public static void main(String[] args) {
	    	// TODO Auto-generated method stub
	        Book b1 = new Book("Chavva", "Savant Shivaji");
	        Book b2 = new Book("Balbharti", "Om patil");

	        b1.display();
	        b2.display();
	    }


	

}
