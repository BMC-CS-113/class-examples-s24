public class Tea extends Drink {
    private String flavor;
    
    public Tea(String temp, double price, char size, String flavor) {
       super(temp, price, size); 
       this.flavor = flavor;
    }
    
    public boolean equals(Object o) {
        Tea t = (Tea) o;
        return super.equals(o) && t.flavor.equals(this.flavor);
    }
}
