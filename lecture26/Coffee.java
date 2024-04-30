public class Coffee extends Drink {
    protected String roast;
    
    public Coffee(String temp, double price, char size, String roast) {
       super(temp, price, size); 
       this.roast = roast;
    }
    
}
