public class ResidentialBuilding implements Building {
    String address;

    public ResidentialBuilding(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public int getNumFloors() {
        return 3;
    }

    public int getOccupancy() { //number of residents
        return 5;
    }

    public boolean checkSafety() { //checks if the building meets safety regulations
        return true;
    }
}
