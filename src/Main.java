public class Main {
    public static void main(String[] args){
//        Destination destination = new Destination();
//        Activity activity = new Activity("name","description",5.5,5);
//        Activity activity1 = new Activity("walking","walk",7.2,7);
//        destination.activities.add(activity);
//        destination.activities.add(activity1);
//        destination.print();
        Standard standardPassenger = new Standard();
        Senior seniorPassenger = new Senior();
        Premium premiumPassenger = new Premium();
        standardPassenger.print();
        seniorPassenger.print();
        premiumPassenger.print();


    }
}
