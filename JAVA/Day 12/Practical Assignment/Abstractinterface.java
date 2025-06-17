package abstractinterfaceprint;
//TODO Auto-generated method stub

interface Printable {
    void display();
}

class Document implements Printable {
    public void display() {
        System.out.println("Printing documents!!!!!!!!!!");
    }
}

class Photo implements Printable {
    public void display() {
        System.out.println("Printing photos!!!!!!!!!");
    }
}

public class Abstractinterface {
    public static void main(String[] args) {
        Printable p1 = new Document();
        Printable p2 = new Photo();
        p1.display();
        p2.display();
    }
}


	



		

	