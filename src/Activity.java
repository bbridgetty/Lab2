public class Activity {
    String name = new String();
    String description = new String();
    double cost;
    int capacity;

    public Activity(String name, String description, double cost, int capacity){
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;

    }
    public boolean signUp(Destination destination, Passenger passenger){
        if(passenger.signUps.containsKey(destination)||(destination.name.length()>=capacity)){
            return false;
        }

        if(passenger instanceof Senior){
            Senior seniorPassenger = (Senior) passenger; //cast expression
            if(seniorPassenger.balance>=cost*(0.9)){
                seniorPassenger.balance = seniorPassenger.balance - cost*(0.9);
                //missing add destination to passenger sign ups
                capacity--; /*decrease capacity of activity*/
                return true; /*successful sign up*/
            }
        }
        else if(passenger instanceof Premium){
            Premium premiumPassenger = (Premium) passenger; //cast expression
            //missing add destination to passenger sign ups
            capacity--; /*decrease capacity of activity*/
            return true; /*successful sign up*/
        }
        else if(passenger instanceof Standard){
            Standard standardPassenger = (Standard) passenger; //cast expression
            if(standardPassenger.balance>=cost){
                standardPassenger.balance = standardPassenger.balance - cost;
                //missing add destination to passenger sign ups
                capacity--; /*decrease capacity of activity*/
                return true; /*successful sign up*/
            }
        }
        return false;
    }

    public void print(){
        System.out.println(name);
        System.out.println(description);
        System.out.println(cost);
        System.out.println(capacity);
    }
}

/*
Each passenger can sign up for zero or one activity at each destination of the cruise.
Once an activity has reached its capacity no more passengers can sign up for it.

 */