package inheritance;

class Vehicle{
	
	int maxSpeed;
	String fuelType;
	
	Vehicle(int maxSpeed, String fuelType){
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	void displayInfo() {
		System.out.println("Vehicle Details");
		System.out.println("Max Speed: "+maxSpeed);
		System.out.println("Fuel Type: "+fuelType);
	}
}

class Car extends Vehicle{
	
	int seatCapacity;
	Car(int maxSpeed, String fuelType, int seatCapacity){
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	@Override
	void displayInfo() {
		System.out.println("Car Details");
		System.out.println("Max Speed: "+maxSpeed);
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("Seat capacity: "+seatCapacity);
	}
}

class Truck extends Vehicle{
	
	int noOfTyres;
	Truck(int maxSpeed, String fuelType, int noOfTyres){
		super(maxSpeed, fuelType);
		this.noOfTyres = noOfTyres;
	}
	
	@Override
	void displayInfo() {
		System.out.println("Truck Details");
		System.out.println("Max Speed: "+maxSpeed);
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("No. Of Tyres: "+noOfTyres);
	}
}

class Bike extends Vehicle{
	
	String brand;
	Bike(int maxSpeed, String fuelType, String brand){
		super(maxSpeed, fuelType);
		this.brand = brand;
	}
	
	@Override
	void displayInfo() {
		System.out.println("Bike Details");
		System.out.println("Max Speed: "+maxSpeed);
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("Brand: "+brand);
	}
}

public class VehicleAndTransportSystem {
	public static void main(String[] args) {
		Vehicle[] garage = new Vehicle[4];
		garage[0] = new Vehicle(180, "Diesel");
		garage[1] = new Car(180, "Petrol", 7);
		garage[2] = new Truck(150, "Diesel", 16);
		garage[3] = new Bike(120, "Petrol", "Hero");
		
		for(Vehicle v : garage) {
			v.displayInfo();
		}
	}
}
