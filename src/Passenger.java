import java.util.HashMap;

public class Passenger {
    String name = new String();
    int passengerNumber;
    HashMap<Destination, Activity> signUps = new HashMap<>();

    public void print(){
        System.out.println(name);
        System.out.println(passengerNumber);
        if(this instanceof Senior){
            Senior seniorPassenger = (Senior) this;
            System.out.println(seniorPassenger.balance);
        }
        else if(this instanceof Standard){
            Standard standardPassenger = (Standard) this;
            System.out.println(standardPassenger.balance);
        }
        System.out.println(signUps);
    }
    //for loop with hashmap in java (very similar to destinations)
}
