public class Apple extends Fruit {
    private String type;
    /*
        Additional instance variable: type (String)
        Constructor: value constructor
        Implement the equals method inherited from the Fruit class to compare apples based on their name, color, and type.
    */

    public Apple(String name, String color, String type) {
        super(name, color);
        this.type = type;
    }
    
    public String getType() {
        return type;
    }

    public boolean equals(Object o) {
        Apple a = (Apple) o;
        return super.equals(o) && a.getType().equals(this.type);
    }

}
