
import java.util.ArrayList;

public class CruiseShip {
    String name = new String();
    int capacity;
    ArrayList<Destination> itinerary;
    ArrayList<String> passengers;
    public void print(){
        System.out.println(itinerary);
        System.out.println(passengers);
    }
}
