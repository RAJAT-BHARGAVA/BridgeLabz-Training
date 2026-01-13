import java.util.ArrayList;
import java.util.Scanner;

// custom exception
class CourseLimitExceededException extends Exception {
    CourseLimitExceededException(String msg) {
        super(msg);
    }
}

// abstract service
interface RegistrationService {
    void enrollCourse(String course) throws CourseLimitExceededException;
    void dropCourse(String course);
    void showCourses();
}

// base class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// student class
class Student extends Person implements RegistrationService {

    private int rollNo;          // encapsulated data
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();

    Student(int rollNo, String name, int age) {
        super(name, age);
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void enrollCourse(String course) throws CourseLimitExceededException {
        if (courses.size() >= 5) {
            throw new CourseLimitExceededException("Course limit exceeded");
        }
        courses.add(course);
        grades.add(0);
        System.out.println("Course enrolled: " + course);
    }

    public void dropCourse(String course) {
        int index = courses.indexOf(course);
        if (index != -1) {
            courses.remove(index);
            grades.remove(index);
            System.out.println("Course dropped: " + course);
        } else {
            System.out.println("Course not found");
        }
    }

    public void addGrade(String course, int grade) {
        int index = courses.indexOf(course);
        if (index != -1) {
            grades.set(index, grade);
            System.out.println("Grade updated");
        } else {
            System.out.println("Course not found");
        }
    }

    public void showCourses() {
        System.out.println("Enrolled Courses:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i) + " - Grade: " + grades.get(i));
        }
    }
}

// main class
public class StudentCourseRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student(101, "Rajat", 20);

        int choice;

        do {
            System.out.println("\n1 Enroll Course");
            System.out.println("2 Drop Course");
            System.out.println("3 Add Grade");
            System.out.println("4 View Courses & Grades");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            try {
                if (choice == 1) {
                    System.out.print("Enter course name: ");
                    s.enrollCourse(sc.nextLine());
                }

                else if (choice == 2) {
                    System.out.print("Enter course name: ");
                    s.dropCourse(sc.nextLine());
                }

                else if (choice == 3) {
                    System.out.print("Enter course name: ");
                    String c = sc.nextLine();
                    System.out.print("Enter grade: ");
                    s.addGrade(c, sc.nextInt());
                }

                else if (choice == 4) {
                    s.showCourses();
                }

            } catch (CourseLimitExceededException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 0);

        sc.close();
    }
}
