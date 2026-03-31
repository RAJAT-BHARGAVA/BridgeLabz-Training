import java.util.Scanner;
class Course{
    // instance variable
    String  courseName ;
    String duration ;
    int fees ;
    // class variable 
    static String instituteName = "GLA Univeristy";
    // Default Constructor 
    Course(){
        this.courseName = "B.Tech";
        this.duration = "4 Years";
        this.fees = 900000 ;
    }
    // Parametarized Constructor
    Course(String courseName , String duration , int fees){
        this.courseName = courseName ;
        this.duration = duration ;
        this.fees = fees ;
    }
    // instance Method
    void displayCourseDetails(){
        System.out.println("The Course Name is :    " + courseName);
        System.out.println("The Course Duration is :    " + duration);
        System.out.println("The Course Fees is :    " + fees);
        System.out.println("The Institute Name is :  " + instituteName );

    }
    // class method to update the instute Name
    static void updateInstituteName(String NewInstuteName){
        System.out.println("The previous Institute Name is :  " + instituteName );
        instituteName = NewInstuteName;
        System.out.println("The new Institute Name is :  " + instituteName);

    }

}
public class OnlineCourseManagement {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        Course course1 = new Course();
        course1.displayCourseDetails();
        System.out.print("If you want to update the institute name .Please Enter :  ");
        String instituteName = sc.nextLine();
        Course.updateInstituteName(instituteName);
        sc.close();
    }
}
