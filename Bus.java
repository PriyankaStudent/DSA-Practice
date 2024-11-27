abstract class Transport {
    abstract void Book();

    Transport(){
        System.out.println("Your mode of transportation is being processesd");
    }
}

class Flight extends Transport{
    void Book(){
        System.out.println("Booking a flight: Seat selction, Dynamic pricing and baggage option");
    }
    void select(int a, int b){
        System.out.println("Selected seat: "+a+" Baggage capacity: "+b);
        System.out.println("Your Flight ticket is booked successfully");
    }
}

class Train extends Flight{
    void Book(){
        System.out.println("Booking a Train: Selecting class, Fixed pricing and concession");
    }
    void select(String a, int b){
        System.out.println("Selected class: "+a+" with concession: "+b);
        System.out.println("Your Train ticket is booked successfully");
    }
}

public class Bus extends Train{
    void Book(){
        System.out.println("Booking a Bus: Simple booking with fixed price per seat");
    }
    void select(){
        System.out.println("Your Bus ticket is booked successfully");
    }
    public static void main(String Priya[]){
        Flight f=new Flight();
        f.Book();
        f.select(36,25);
        Train t=new Train();
        t.Book();
        t.select("Second class",500);
        Bus b=new Bus();
        b.Book();
        b.select();
        System.out.println("Tata....");
    }
    
}

