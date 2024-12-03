public class Sushi extends Food {
    private String fish;
    private boolean rice;
    private boolean seaweed;

    // No-argument constructor
    public Sushi() {
        super(); // Call the superclass constructor
        this.fish = "Unknown Fish";
        this.rice = true; // Default assumption: sushi usually has rice
        this.seaweed = false; // Default assumption: no seaweed
    }

    // Parameterized constructor
    public Sushi(double price, String name, boolean spice, String fish, boolean rice, boolean seaweed) {
        super(price, name, spice); // Call the superclass constructor
        this.fish = fish;
        this.rice = rice;
        this.seaweed = seaweed;
    }

    // Getters and setters for sushi-specific variables
    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public boolean hasRice() {
        return rice;
    }

    public void setRice(boolean rice) {
        this.rice = rice;
    }

    public boolean hasSeaweed() {
        return seaweed;
    }

    public void setSeaweed(boolean seaweed) {
        this.seaweed = seaweed;
    }

    // toString method to display sushi information, including food details
    public String toString() {
        return super.toString() + ", Fish: " + fish + ", Rice: " + (rice ? "Yes" : "No") + ", Seaweed: " + (seaweed ? "Yes" : "No");
    }
}
