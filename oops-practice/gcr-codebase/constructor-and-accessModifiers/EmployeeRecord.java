class Employee {
    
    public int employeeID;         
    protected String department;  
    private double salary;        

    // Constructor
    Employee(int employeeID, String department, double salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    
    public void setSalary(double salary){
        this.salary = salary;
    }

    
    public void showSalary(){
        System.out.println("Salary: " + salary);
    }

    
    public void showDetails(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

// Manager subclass
class Manager extends Employee {

    Manager(int employeeID, String department, double salary){
        super(employeeID, department, salary);
    }

    // Accessing employeeID and department
    public void showManagerInfo(){
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Manager Department: " + department);
    }
}

public class EmployeeRecord{
    public static void main(String[] args) {

        Manager m = new Manager(101, "IT", 50000);

        m.showDetails();
        m.showSalary();

        
        m.setSalary(65000);
        m.showSalary();

        m.showManagerInfo();
    }
}
