class PhysicsStudent extends Student { //TODO 1: inherit from student
    
    private int labNum;

    //TODO 2: constructor
    public PhysicsStudent(String name, int id, int labNum) {
        super(name, id);  
        this.labNum = labNum;
    }

    //TODO 3: create getters and setters

    public int getLabNum() {
        return labNum;
    }

    public void setLabNum(int labNum) {
        this.labNum = labNum;
    }

    public String toString()  {
        return getName() +  " " + getId() + " in lab section: " + labNum;
    }

    

}

