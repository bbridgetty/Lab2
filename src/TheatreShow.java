import java.util.ArrayList;

public class TheatreShow extends Activity{
    ArrayList<Star> stars;

    public ArrayList<Star> getStars() {
        return stars;
    }

    public TheatreShow(String name, String description, double cost, int capacity, ArrayList<Star> stars) {
        super(name, description, cost, capacity);
        this.stars = stars;
    }
}
