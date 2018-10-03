package attractions;

public class Rollercoaster extends Attraction {

    private int numberOfLoops;

    public Rollercoaster(double price, int minHeight, String name, int numberOfLoops) {
        super(price, minHeight, name);
        this.numberOfLoops = numberOfLoops;
    }


    public int getNumberOfLoops() {
        return numberOfLoops;
    }
}
