public class Animal {
    protected double weight;
    private String color;
    private String name;
    //private boolean isMammal;

    public Animal(double weight, String color, String name) { 
        this.weight = weight;
        this.color = color;
        this.name = name; 
    }

    public void move() {
        System.out.println("An animal moves");
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    //setters

    public void setWeight(double weight) {
        this.weight = weight;
        //change the value of the instance variable weight
    }

    public void setColor(String color) {
        this.color = color;
    }




}
