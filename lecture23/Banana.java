public class Banana extends Fruit {
    private double length;

    /*
     * Additional instance variable: length (double)
     * Constructor: value constructor
     * Implement the equals method inherited from the Fruit class to compare bananas based on their name, color, and length.
     */

    public Banana(String name, String color, double length) {
        super(name, color);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public boolean equals(Object o) {
        Banana b = (Banana) o;
        return super.equals(o) && b.getLength() == this.length;
    }

}
