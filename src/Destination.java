import java.util.ArrayList;

public class Destination { //create constructor that will take in a name and set name (same as activity)
    String name = new String(); //initialised with a default value
    ArrayList<Activity> activities = new ArrayList<>();
    public Destination(){ //first instance that the code will run for the destination
    }
    public void capacity(){
        for(int i = 0; i<activities.size(); i++){
            if(activities.get(i).capacity>0){
                activities.get(i).print();
            }
        }
    }
    public void itinerary(){
        for(int j = 0; j<Destination.size(); j++){
            System.out.println(name);
            for(int i = 0; i<activities.size(); i++){
                System.out.println(activities.get(i).name);
                System.out.println(activities.get(i).description);
                System.out.println(activities.get(i).cost);
                System.out.println(activities.get(i).capacity);
                if(Activity instanceof TheatreShow){
                    System.out.println(TheatreShow.stars);
                }
                else if(Activity instanceof WalkingTour){
                    System.out.println(WalkingTour.distance);
                }
            }
        }
    }
}
/*
Print the itinerary of a cruise ship, including the ship name, the destinations it will visit, and the details of the activities available at each destination, including the activity name, cost, capacity, and, where applicable, the distance or stars.
for loop for all destinations as well as activities in each destination
check type of activity, and then print relevant information (same as passenger & cost)

 */
