public class Drink {
    protected String temp;
    protected double price;
    protected char size;

    public Drink(String temp, double price, char size) {
        this.temp = temp;
        this.price = price;
        this.size = size;
    }

    public boolean equals(Object o) {
        Drink d = (Drink) o; 
        return d.temp.equals(this.temp) && d.price == this.price && d.size == this.size;
    }
}
