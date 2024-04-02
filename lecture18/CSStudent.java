class CSStudent extends Student implements ExamTaker {  
    //TODO 1: inherit from student
    
    private String username;

    //TODO 2: constructor
    public CSStudent(String name, int id, String username) {
        super(name, id);
        this.username = username;
    }

    //TODO 3: create getters and setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username; 
    }

    public String toString()  {
        return getName() +  " " + getId( ) + 
                    " with goldengate username: " + username;
    }

    public double getCumulativeGPA() {
        return 100;
    }

    public String getDatesOfFinals() {
        String dates = "";
        dates += "Data structures: May 8th\n";
        dates += "Algorithms: May 1st\n";
        dates += "Discrete Schedule: May 6th\n";
        return dates;
    }

    public String getSubjects() {
        return "Subjects: Data structures, Algo, Discrete math";
    }

}
