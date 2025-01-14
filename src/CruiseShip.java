
import java.util.ArrayList;

public class CruiseShip {
    String name;
    int capacity;
    private ArrayList<Destination> itinerary;
    private ArrayList<Passenger> passengers;

    public CruiseShip(String name, int passengerCapacity){
        this.name = name;
        this.capacity = passengerCapacity;
        itinerary = new ArrayList<>();
        passengers = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public int getPassengerCapacity(){
        return capacity;
    }

    public ArrayList<Destination> getItinerary(){
        return itinerary;
    }

    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }

    // add passenger to the cruise ship
    public void addPassengers(Passenger passenger){
        if(passengers.contains(passenger) || capacity == passengers.size()){
            return;
        }
        passengers.add(passenger);
    }

    // remove passenger from the cruise ship
    public void removePassengers(Passenger passenger){
        if(passengers.contains(passenger)) passengers.remove(passenger);
    }

    // add a destination to the cruise ship
    public void addDestination(Destination destination){
        itinerary.add(destination);
    }

    public void print(){
        System.out.println(itinerary);
        System.out.println(passengers);
    }
}
