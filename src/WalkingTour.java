public class WalkingTour extends Activity{
    double distance;

    public double getDistance() {
        return distance;
    }

    public WalkingTour(String name, String description, double cost, int capacity) {
        super(name, description, cost, capacity);
    }
}
