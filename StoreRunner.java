public class StoreRunner {
  public static void main(String[] args) {

    // Creating instances of Food
    Food salmon = new Food(15.99, "Salmon Roll", true);  // Spicy salmon roll
    Food tuna = new Food(12.50, "Tuna Roll", false);    // Non-spicy tuna roll

    // Creating instances of Sushi
    Sushi californiaRoll = new Sushi(10.00, "California Roll", false, "Crab", true, true);  // Has rice, has seaweed
    Sushi spicyTuna = new Sushi(13.00, "Spicy Tuna Roll", true, "Tuna", true, true);  // Has rice, has seaweed

    // Creating instances of Ramen
    Ramen misoRamen = new Ramen(14.99, "Miso Ramen", true, "Miso", "Large");  // Spicy miso ramen, large size
    Ramen soyRamen = new Ramen(12.00, "Soy Ramen", false, "Soy", "Medium");  // Non-spicy soy ramen, medium size

    // Printing the state of each object using the toString() method
    System.out.println(salmon.toString());
    System.out.println(tuna.toString());
    System.out.println(californiaRoll.toString());
    System.out.println(spicyTuna.toString());
    System.out.println(misoRamen.toString());
    System.out.println(soyRamen.toString());
  }
}
