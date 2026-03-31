class Vehical{
    // instance Variable
    String ownerName ;
    String vehicalType ;
    //class variable
    static int registrationFee = 20000;
    // default constructor 
    Vehical(){
        this.ownerName = "Rajat Bhargava";
        this.vehicalType = "Car";
    }
    // Parametrized Constructor 
    Vehical(String ownerName , String vehicalType , int registrationFee){
        this.ownerName = ownerName ;
        this.vehicalType = vehicalType ;
        updateRegistrationFee(registrationFee);
    }
    // instance variable 
    void displayVehicleDetails(){
        System.out.println("The Vehical Owner Name is : " + ownerName);
        System.out.println("The Vehical Type is : " + vehicalType);
        System.out.println("The Registration Amount of Vehical is : " + registrationFee);
    }
    // Class Method 
    static void updateRegistrationFee(int newRegistrationFees){
        registrationFee = newRegistrationFees ;
        System.out.println("The new Registration Amount is :    " + registrationFee);
    }
}
public class VehicalRegistration {
    public static void main(String [] args){
        Vehical vehical1 = new Vehical();
        vehical1.displayVehicleDetails();

        System.out.println("-----------the data of parameterized cons ..------------ ");
        
        Vehical vehical2 = new Vehical("Rajat", "bike",10000);
        vehical2.displayVehicleDetails();


    }
}
