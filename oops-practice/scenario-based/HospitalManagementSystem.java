import java.util.ArrayList;
import java.util.Scanner;

// custom exception
class AppointmentNotAvailableException extends Exception {
    AppointmentNotAvailableException(String msg) {
        super(msg);
    }
}

// service interface
interface HospitalService {
    void addPatient(Patient p);
    void removePatient(int id);
    void bookAppointment(int patientId, int doctorId)
            throws AppointmentNotAvailableException;
}

// base class
class Person {
    int id;
    String name;
    int age;

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

// patient class
class Patient extends Person {
    ArrayList<String> medicalHistory = new ArrayList<>();

    Patient(int id, String name, int age) {
        super(id, name, age);
    }

    void addRecord(String record) {
        medicalHistory.add(record);
    }

    void showHistory() {
        System.out.println("Medical History:");
        for (String s : medicalHistory) {
            System.out.println("- " + s);
        }
    }
}

// doctor class
class Doctor extends Person {
    String specialization;
    int availableSlots;

    Doctor(int id, String name, int age, String specialization, int slots) {
        super(id, name, age);
        this.specialization = specialization;
        this.availableSlots = slots;
    }

    double calculateFee() {
        return 500;
    }
}

// specialist doctor (polymorphism)
class SpecialistDoctor extends Doctor {

    SpecialistDoctor(int id, String name, int age, String specialization, int slots) {
        super(id, name, age, specialization, slots);
    }

    double calculateFee() {
        return 1000;
    }
}

// appointment class
class Appointment {
    Patient patient;
    Doctor doctor;

    Appointment(Patient p, Doctor d) {
        patient = p;
        doctor = d;
    }

    void showAppointment() {
        System.out.println("Patient: " + patient.name +
                ", Doctor: " + doctor.name +
                ", Fee: " + doctor.calculateFee());
    }
}

// main system
public class HospitalManagementSystem implements HospitalService {

    ArrayList<Patient> patients = new ArrayList<>();
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Appointment> appointments = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
        System.out.println("Patient added");
    }

    public void removePatient(int id) {
        patients.removeIf(p -> p.id == id);
        System.out.println("Patient removed");
    }

    public void bookAppointment(int patientId, int doctorId)
            throws AppointmentNotAvailableException {

        Patient patient = null;
        Doctor doctor = null;

        for (Patient p : patients)
            if (p.id == patientId)
                patient = p;

        for (Doctor d : doctors)
            if (d.id == doctorId)
                doctor = d;

        if (patient == null || doctor == null) {
            System.out.println("Invalid patient or doctor");
            return;
        }

        if (doctor.availableSlots <= 0) {
            throw new AppointmentNotAvailableException("No slots available");
        }

        doctor.availableSlots--;
        Appointment ap = new Appointment(patient, doctor);
        appointments.add(ap);

        System.out.println("Appointment booked");
        ap.showAppointment();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HospitalManagementSystem hms = new HospitalManagementSystem();

        hms.doctors.add(new Doctor(1, "Dr. Sharma", 45, "General", 2));
        hms.doctors.add(new SpecialistDoctor(2, "Dr. Mehta", 50, "Cardiology", 1));

        int choice;

        do {
            System.out.println("\n1 Add Patient");
            System.out.println("2 Remove Patient");
            System.out.println("3 Book Appointment");
            System.out.println("4 View Medical History");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();

                    hms.addPatient(new Patient(id, name, age));
                }

                else if (choice == 2) {
                    System.out.print("Enter patient id: ");
                    hms.removePatient(sc.nextInt());
                }

                else if (choice == 3) {
                    System.out.print("Patient id: ");
                    int pid = sc.nextInt();
                    System.out.print("Doctor id: ");
                    int did = sc.nextInt();
                    hms.bookAppointment(pid, did);
                }

                else if (choice == 4) {
                    System.out.print("Patient id: ");
                    int pid = sc.nextInt();
                    for (Patient p : hms.patients) {
                        if (p.id == pid) {
                            p.showHistory();
                        }
                    }
                }

            } catch (AppointmentNotAvailableException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 0);

        sc.close();
    }
}
