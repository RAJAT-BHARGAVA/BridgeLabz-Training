package JavaStreams;
import java.util.*;
 class Doctor{
	 private String name;
	    private String speciality;
	    private boolean availableOnWeekend;

	    public Doctor(String name, String speciality, boolean availableOnWeekend) {
	        this.name = name;
	        this.speciality = speciality;
	        this.availableOnWeekend = availableOnWeekend;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getSpeciality() {
	        return speciality;
	    }

	    public boolean isAvailableOnWeekend() {
	        return availableOnWeekend;
	    }

	    @Override
	    public String toString() {
	        return name + " - " + speciality + " - Weekend Available: " + availableOnWeekend;
	    }
 }

public class DoctorChecker {
	public static void main(String[] args) {
		List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Dr. Rajesh Sharma", "Cardiologist", true));
        doctors.add(new Doctor("Dr. Priya Mehta", "Dermatologist", false));
        doctors.add(new Doctor("Dr. Anil Kumar", "Orthopedic Surgeon", true));
        doctors.add(new Doctor("Dr. Sneha Verma", "Pediatrician", true));
        doctors.add(new Doctor("Dr. Vikram Singh", "Neurologist", false));
        
        doctors.stream().filter(Doctor::isAvailableOnWeekend).sorted(Comparator.comparing(Doctor::getSpeciality)).forEach(System.out::println);
	}
	
	
}
