public class HondaCivic implements Vehicle {

    private String color;
    private int year;
    private String plate;

    public HondaCivic(String color, int year, String plate) {
        this.color = color;
        this.year = year;
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    public void stop() {
        System.out.println("screechhhh");
    }

    public void move() {
        System.out.println("screech but moving");
    }

    public void start() {
        System.out.println("vroooom");
    }

    public boolean equals(Object o) {
        return this.getPlate().equals(((HondaCivic)o).getPlate());
    }

}
