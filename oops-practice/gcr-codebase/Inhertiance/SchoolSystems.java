package inheritance;

class Person {
	protected String name;
	protected int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Teacher extends Person {
	private String subject;

	Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public void displayRole() {
		System.out.println("Role: Teacher");
		System.out.println("Subject: " + subject);
	}
}

class Student extends Person {
	private String grade;

	Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	public void displayRole() {
		System.out.println("Role: Student");
		System.out.println("Grade: " + grade);
	}
}

class Staff extends Person {
	private String department;

	Staff(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}

	public void displayRole() {
		System.out.println("Role: Staff");
		System.out.println("Department: " + department);
	}
}

public class SchoolSystems {
	public static void main(String[] args) {
		Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
		Student student = new Student("Anita", 16, "10th Grade");
		Staff staff = new Staff("Ramesh", 35, "Administration");
		teacher.displayRole();
		teacher.displayDetails();
		System.out.println();
		student.displayRole();
		student.displayDetails();
		System.out.println();
		staff.displayRole();
		staff.displayDetails();
	}
}
