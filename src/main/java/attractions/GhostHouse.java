package attractions;

public class GhostHouse extends Attraction{

    private int spookyRating;

    public GhostHouse(double price, int minHeight, String name, int spookyRating) {
        super(price, minHeight, name);
        this.spookyRating = spookyRating;
    }
}
