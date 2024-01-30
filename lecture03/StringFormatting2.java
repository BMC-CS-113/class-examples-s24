public class StringFormatting2 {
  public static void main(String[] args) {
    //TODO 1: read in the number of gallons of gas the user wants to buy
    double numGallons = Double.parseDouble(System.console().readLine());
    //TODO 2: read in the price of one gallon gas
    double price = Double.parseDouble(System.console().readLine());
    
    double totalPrice = price * numGallons;
    //TODO 3: print!
    System.out.printf("You owe me %.2f dollars!\n", totalPrice);
    //TODO 4: round to the nearest dollar

  }
}
