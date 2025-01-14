import java.util.ArrayList;
import java.util.HashMap;

public class Passenger {
    private String name;
    private int passengerNumber;
    private ArrayList<Activity> activityList = new ArrayList<>();
    private static int passengers = 1;

    HashMap<Destination, Activity> signUps = new HashMap<>();
    public String getName(){
        return name;
    }

    public int getPassengerNumber(){
        return passengerNumber;
    }

    public void setPassengerNumber(){
        passengerNumber = passengers;
        passengers++; // increment passengers to store the passengerID
    }

    public ArrayList<Activity> getActivityList() {
        return activityList;
    }

    public void setName(String name) {
        this.name = name;
    }


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
