interface Building {
    String getAddress();
    int getNumFloors();
    int getOccupancy(); //number of residents
    boolean checkSafety(); //checks if the building meets safety regulations
}
