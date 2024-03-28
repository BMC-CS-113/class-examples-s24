public class Bird extends Animal {
    protected double featherLength;

    public Bird(double weight, String color, String name) {
        super(weight, color, name);
    }

    public void move() {
        System.out.println("A bird flies");
    }

}
