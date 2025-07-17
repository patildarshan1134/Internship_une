package shapeareacalclulation;

class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius = 5;


    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length = 4; 
    double width = 6;

 
    double area() {
        return length * width;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        System.out.println("Circle area: " + s1.area());
        System.out.println("Rectangle area: " + s2.area());
   
    }
    
}


