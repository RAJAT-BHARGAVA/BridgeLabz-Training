package inheritance;

class Device{
	
	int deviceID;
	String status;
	
	Device(int deviceID, String status){
		this.deviceID = deviceID;
		this.status = status;
	}
}

class Thermostat extends Device{
	
	float tempratureSetting;
	Thermostat(int deviceID, String status, float tempratureSetting){
		super(deviceID, status);
		this.tempratureSetting = tempratureSetting;
	}
	void displayStatus() {
		System.out.println("Device Current Settings");
		System.out.println("Device ID: "+deviceID);
		System.out.println("Status: "+status);
		System.out.println("tempratureSetting: "+tempratureSetting);
	}
}

public class SmartHomeDevices {

	public static void main(String[] args) {
		Thermostat newDevice = new Thermostat(123, "Actice", 54.0f);
		newDevice.displayStatus();
	}

}
