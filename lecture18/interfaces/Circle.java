class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getName() {
      return "Circle";
    } 

    public double getArea() {
        return 3.14 * radius * radius;
    }
}
