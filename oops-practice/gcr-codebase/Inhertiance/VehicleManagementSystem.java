package inheritance;

class Vehicles {
	protected String model;
	protected int maxSpeed;

	Vehicles(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	public void displayDetails() {
		System.out.println("Model: " + model);
		System.out.println("Max Speed: " + maxSpeed + " km/h");
	}
}

interface Refuelable {
	void refuel();
}

class ElectricVehicle extends Vehicles {

	ElectricVehicle(String model, int maxSpeed) {
		super(model, maxSpeed);
	}

	public void charge() {
		System.out.println("Charging the electric vehicle.");
	}
}

class PetrolVehicle extends Vehicles implements Refuelable {

	PetrolVehicle(String model, int maxSpeed) {
		super(model, maxSpeed);
	}

	@Override
	public void refuel() {
		System.out.println("Refueling the petrol vehicle.");
	}
}

public class VehicleManagementSystem {
	public static void main(String[] args) {
		ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 225);
		PetrolVehicle pv = new PetrolVehicle("Honda City", 180);
		ev.displayDetails();
		ev.charge();
		System.out.println();
		pv.displayDetails();
		pv.refuel();
	}
}
