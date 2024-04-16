public class Instructor {

    private String name;
    private String officeBuilding;
    private int officeNumber;
    private boolean officeOpen;
    
    public Instructor(String name, String officeBuilding, int officeNumber) {
        this.name = name;
        this.officeBuilding = officeBuilding;
        this.officeNumber = officeNumber;
        this.officeOpen = false;
    }

    //getters and setters

    public String toString() {
        return this.name + " / " + this.officeBuilding + " / " + this.officeNumber + "\n";
    }

    public void changeOffice(int newOfficeNumber) {
        this.officeNumber = newOfficeNumber;
    }

    public boolean isOfficeOpen() {
        return officeOpen;
    }

    private void openOffice() {
        officeOpen = true;
    }

    private void closeOffice() {
        officeOpen = false;
    }

    public boolean equals(Object o) {
        Instructor i = (Instructor) o;
        return (this.name.equals(i.name)) && (this.officeBuilding.equals(i.officeBuilding)) && (officeNumber == i.officeNumber);
    }

    public static void main(String[] args) {

        Instructor one = new Instructor("elizabeth", "park", 205);
        Instructor two = new Instructor("clara", "park", 112);
        Instructor same = new Instructor("elizabeth", "park", 205);

        System.out.println(one);
        System.out.println(two);
        System.out.println("true: " + one.equals(same));
        System.out.println("false: " + one.equals(two));

    }
}
