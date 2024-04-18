public class Fruit {
    private String name;
    private String color;
    /*
     * Instance variables: name, color: Represents the color of the fruit.
     * Constructor: value constructor
     */

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;        
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean equals(Object o) {
        Fruit f = (Fruit) o;
        return (f.getName().equals(this.name) && f.getColor().equals(this.color));
    }
}
