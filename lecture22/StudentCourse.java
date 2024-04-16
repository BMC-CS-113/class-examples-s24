public class StudentCourse {

    private String name; 
    private String department;
    private Instructor instructor;
    private double grade;
    private char semester;
    private int year;

    public StudentCourse(String name, String department, Instructor instructor, Double grade, char semester, int year) {
        this.name = name;
        this.department = department;
        this.instructor = instructor;
        this.grade = grade;
        this.semester = semester;
        this.year = year;
    }

    //getters and setters
    private void setGrade(double g) {
        this.grade = g;
    }

    public double getGrade() {
        return this.grade;
    }
    public char getSemester() {
        return this.semester;
    }
    public int getYear() {
        return this.year;
    }

    public String toString() {
        return this.name + " / " + this.department + " / " + this.instructor + " / " + this.grade + " / " + this.semester + " / " + this.year;
    }

    public boolean equals(Object o) {
        StudentCourse sc = (StudentCourse) o;
        return this.name.equals(sc.name) && this.department.equals(sc.department) && this.instructor.equals(sc.instructor) 
                     && this.grade == sc.grade && this.semester == sc.semester && this.year == sc.year;
    }
    
}
