public class Food {

  
  private double price;
  private String name;
  private boolean spice;
//no argument constructor
  public Food() {
    this.price = 0.0; //default price
    this.name = "Unkown"; //default name
    this.spice = false; //boolean of true or false if spicy
  }
//parameterized
  public Food (double price, String name, boolean spice) {
    this.price = price;
    this.name = name;
    this.spice = spice;
  }
  //getter and setter method
  public double getPrice() {
    return price;
  }
  public String getName() {
    return name;
  }
  public boolean getSpice() {
    return spice;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setSpice(boolean spice) {
    this.spice = spice;
  }
  //toString method to display price, name, and true of false if spicy
  public String toString() {
    return getPrice() + " "+ getName() +  " " + getSpice();
  }
}