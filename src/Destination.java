import java.util.ArrayList;

public class Destination { //create constructor that will take in a name and set name (same as activity)
    private String name; // name of destination
    private ArrayList<Activity> activities; // list of activities in the destination

    public Destination(String name){
        this.name = name;
        activities = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public void capacity(){
        for(int i = 0; i<activities.size(); i++){
            if(activities.get(i).capacity>0){
                activities.get(i).print();
            }
        }
    }
    public void itinerary(){
        for(int i = 0; i<activities.size(); i++){
            System.out.println(activities.get(i).name);
            System.out.println(activities.get(i).description);
            System.out.println(activities.get(i).cost);
            System.out.println(activities.get(i).capacity);
            if(activities.get(i) instanceof TheatreShow){
                System.out.println(((TheatreShow) activities.get(i)).getStars());
            }
            else if(activities.get(i) instanceof WalkingTour){
                System.out.println(((WalkingTour) activities.get(i)).getDistance());
            }
        }
    }
}
/*
Print the itinerary of a cruise ship, including the ship name, the destinations it will visit, and the details of the activities available at each destination, including the activity name, cost, capacity, and, where applicable, the distance or stars.
for loop for all destinations as well as activities in each destination
check type of activity, and then print relevant information (same as passenger & cost)

 */
