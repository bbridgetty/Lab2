public class Main {
    private static CruiseShip ship;
    private static Destination destination1, destination2, destination3, destination4;
    private static AttractionVisit activity1, activity3, activity5, activity7;
    private static WalkingTour activity2, activity6;
    private static TheatreShow activity4;
    private static Premium passenger1, passenger4, passenger7;
    private static Senior passenger2, passenger5;
    private static Standard passenger3, passenger6;
    public static void main(String[] args){
//        Destination destination = new Destination();
//        Activity activity = new Activity("name","description",5.5,5);
//        Activity activity1 = new Activity("walking","walk",7.2,7);
//        destination.activities.add(activity);
//        destination.activities.add(activity1);
//        destination.print();
        // create cruise ship object
        ship = new CruiseShip("Cruise Ship",25 );
        destination1 = new Destination("HK");
        destination2 = new Destination("Canada");
        destination3 = new Destination("Australia");
        destination4 = new Destination("Hangzhou");
        Standard standardPassenger = new Standard();
        Senior seniorPassenger = new Senior();
        Premium premiumPassenger = new Premium();
        standardPassenger.print();
        seniorPassenger.print();
        premiumPassenger.print();


    }
}
