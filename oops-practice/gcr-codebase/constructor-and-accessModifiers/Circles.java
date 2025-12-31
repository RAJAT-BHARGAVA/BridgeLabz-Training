class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(5.0);   // constructor chaining it calls parameterized constructor
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius of circle: " + radius);
    }

    
}
public class Circles {
    public static void  main(String[] args) {
        Circle c1 = new Circle();        // uses default radius
        Circle c2 = new Circle(10.5);    // uses user radius

        c1.display();
        c2.display();
    }
}
