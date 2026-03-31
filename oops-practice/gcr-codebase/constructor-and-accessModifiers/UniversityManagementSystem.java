class Student{
    public int rollNumber ;
    protected String name;
    private double CGPA = 9.0 ;
    Student(){
    }
    Student(int rollNumber , String name , double CGPA){
        this.rollNumber = rollNumber;
        this.name = name ;
        setCGPA(CGPA);
    }
    // method to modify the cgpa
    public void setCGPA(double CGPA){
        this.CGPA = CGPA ;
    } 
    // method to access cgpa
    public double getCGPA(){
        return this.CGPA;
    }
}
// subclass 
class PostgraduateStudent extends Student {
    // child class constructor 
    PostgraduateStudent(int rollNumber , String name , double CGPA){
        super(rollNumber, name, CGPA);// super used to call parent class constructor
    }

    void displayDetails(){
        System.out.println("Roll Number: " + rollNumber); 
        System.out.println("Name: " + name);              
        System.out.println("CGPA: " + getCGPA());         
    }
}

public class UniversityManagementSystem {
    public static void main(String [] args ){
        Student student1 = new Student();
        // Accessing  the Cgpa
        double resultCGPA =student1.getCGPA();
        System.out.println(resultCGPA);
        // Setting the cgpa
        student1.setCGPA(3.0);
        resultCGPA =student1.getCGPA();
        System.out.println(resultCGPA);

        System.out.println("-----------------");
        PostgraduateStudent ps = new PostgraduateStudent(10,"Rajat", 8.5);
        ps.displayDetails();
    }
}
