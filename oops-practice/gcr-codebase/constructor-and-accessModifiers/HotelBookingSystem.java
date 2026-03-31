public class HotelBookingSystem {
    String guestName ;
    String roomType ;
    int nights ;

    HotelBookingSystem(){
        guestName ="Rajat";
        roomType = "Luxary";
        nights = 4;
    }

    // parametrized 
    HotelBookingSystem(String guestName , String roomType , int nights){
        this.guestName = guestName;
        this.roomType = roomType ;
        this.nights = nights ;
    }

    // copied
    HotelBookingSystem(HotelBookingSystem others){
        this.guestName = others.guestName;
        this.roomType = others.roomType;
        this.nights = others.nights;

    }

    // display 
    void dispaly(){
        System.out.println("The Guest Name is : "+ guestName);
        System.out.println("The Guest Room type is : "+ roomType);
        System.out.println("The Guest stay nights are : "+ nights);
    }

    public static void main(String [] args ){
        HotelBookingSystem room = new HotelBookingSystem();
        HotelBookingSystem room2 = new HotelBookingSystem("Abc" , "Simple" ,2);
        HotelBookingSystem room3 = new HotelBookingSystem(room2);

        room.dispaly();
        System.out.println("--------------------------");
        System.out.println("the parameterized ");
        room2.dispaly();

        System.out.println("--------------------------");
        System.out.println("the copied cons....");
        room3.dispaly();

    }
    
}
