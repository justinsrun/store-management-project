public class Ramen extends Food {

    // Instance variables specific to Ramen
    private String broth;  // Type of broth (e.g., miso, soy, pork, etc.)
    private String size;   // Size of the ramen (e.g., small, medium, large)

    // No-argument constructor
    public Ramen() {
        super();  // Call the superclass constructor to initialize price, name, and spice
        this.broth = "Unknown";  // Default value for broth
        this.size = "Medium";    // Default value for size
    }

    // Parameterized constructor
    public Ramen(double price, String name, boolean spice, String broth, String size) {
        super(price, name, spice);  // Call the superclass constructor
        this.broth = broth;         // Initialize the broth
        this.size = size;           // Initialize the size
    }

    // Accessor and Mutator Methods (getters and setters)
    public String getBroth() {
        return broth;
    }

    public void setBroth(String broth) {
        this.broth = broth;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // toString() method to include ramen-specific details
    public String toString() {
        // Use the superclass toString() method and add ramen-specific information
        return super.toString() + ", Broth: " + broth + ", Size: " + size;
    }
}
