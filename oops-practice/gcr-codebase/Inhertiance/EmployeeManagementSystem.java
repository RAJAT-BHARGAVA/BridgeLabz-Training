package inheritance;

class Employee{
	String name;
	int id;
	int salary;
	
	Employee(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	void displayDetails() {
		System.out.println("Employee Details");
		System.out.println("Emp ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
}

class Manager extends Employee{
	
	int teamSize;
	Manager(String name, int id, int salary, int teamSize){
		super(name, id, salary);
		this.teamSize = teamSize;
	}
	@Override
	void displayDetails() {
		System.out.println("Manager Details");
		System.out.println("Emp ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Team Size: "+teamSize);
	}
}

class Developer extends Employee{
	
	String programmingLanguage;
	Developer(String name, int id, int salary, String programmingLanguage){
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}
	@Override
	void displayDetails() {
		System.out.println("Developer Details");
		System.out.println("Emp ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Programming Language: "+programmingLanguage);
	}
}

class Intern extends Employee{
	
	String department;
	Intern(String name, int id, int salary, String department){
		super(name, id, salary);
		this.department = department;
	}
	@Override
	void displayDetails() {
		System.out.println("Intern Details");
		System.out.println("Emp ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+department);
	}
}

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Employee newEmp = new Employee("Anuj", 101, 12000);
		Manager newManager = new Manager("Rajat", 102, 18000, 5);
		Developer newDeveloper = new Developer("Subhash", 103, 20000, "Java");
		Intern newIntern = new Intern("Shaurya", 104, 8000, "HR");
		newEmp.displayDetails();
		newManager.displayDetails();
		newDeveloper.displayDetails();
		newIntern.displayDetails();
	}
}
