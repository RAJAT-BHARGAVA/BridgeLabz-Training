package inheritance;

class Persons {
	protected String name;
	protected int id;

	Persons(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
	}
}

interface Worker {
	void performDuties();
}

class Chef extends Persons implements Worker {

	Chef(String name, int id) {
		super(name, id);
	}
	@Override
	public void performDuties() {
		System.out.println("Chef Duties: Preparing and cooking food.");
	}
}

class Waiter extends Persons implements Worker {

	Waiter(String name, int id) {
		super(name, id);
	}
	@Override
	public void performDuties() {
		System.out.println("Waiter Duties: Serving food and assisting customers.");
	}
}

public class RestaurantManagementSystem {
	public static void main(String[] args) {
        Chef chef = new Chef("Arjun", 101);
        Waiter waiter = new Waiter("Ravi", 202);
        chef.displayDetails();
        chef.performDuties();
        System.out.println();
        waiter.displayDetails();
        waiter.performDuties();
    }
}