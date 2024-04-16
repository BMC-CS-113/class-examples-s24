public class Student { 
    private String name;
    private String major;
    private StudentCourse[] courses = new StudentCourse[1000];
    private int numCourses;

    public Student(String name, String major) {
        this.name = name;
        this.major = major; 
        this.numCourses = 0;
    }

    //getters and setters
    public StudentCourse[] getCourses() {
        return this.courses;
    }

    public String toString() {
        if (numCourses == 0) {
            return "INACTIVE: " + name +  " " + major;
        }

        return name +  " " + major;
    }

    private boolean eqArrays(StudentCourse[] courses) {
        for (int i=0; i<courses.length; i++) {
            if ((courses[i] != null && this.courses[i] == null) || (courses[i] == null && this.courses[i] != null)) {
                return false;
            } else if (courses[i] == null && this.courses[i] == null) {
                return true; 
            } else if (!courses[i].equals(this.courses[i])) {
                return false;
            }
        }

        return true;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Student)) {
            return false;
        }
        Student s = (Student) o; 
        return this.name.equals(s.name) && this.major.equals(s.major)  && eqArrays(courses);
    }

    //computes the student's GPA across all courses they have taken.
    public double computeGPA() {
        StudentCourse[] courses = this.courses;
        double sum = 0;
        for (int i = 0; i < this.numCourses; i++) {
            sum += courses[i].getGrade();
        }
        return sum / this.numCourses;
    }
    
    //computes the student’s GPA across all courses they have taken in the fall or spring.
    public double computeGPA(char semester) {
        StudentCourse[] courses = this.courses;
        double sum = 0;
        double numCourses = 0;
        for (int i = 0; i < this.numCourses; i++) {
            StudentCourse cur = courses[i];
            if (cur.getSemester() == semester) {
                sum += cur.getGrade();
                numCourses += 1;
            }
        }
        return sum / numCourses;
    }
    
    //computes the student’s GPA across all courses they have taken in a specific year.
    public double computeGPA(int year) {
        StudentCourse[] courses = this.courses;
        double sum = 0;
        double numCourses = 0;
        for (int i = 0; i < this.numCourses; i++) {
            StudentCourse cur = courses[i];
            if (cur.getYear() == year) {
                sum += cur.getGrade();
                numCourses += 1;
            }
        }
        return sum / numCourses;
    }
    
    //computes the student’s GPA across all courses they have taken in a specific semester.
    public double computeGPA(char semester, int year) {
        StudentCourse[] courses = this.courses;
        double sum = 0;
        double numCourses = 0;
        for (int i = 0; i < this.numCourses; i++) {
            StudentCourse cur = courses[i];
            if (cur.getSemester() == semester && cur.getYear() == year) {
                sum += cur.getGrade();
                numCourses += 1;
            }
        }
        return sum / numCourses;
    }

    //adds a course to the student’s list of courses.
    public void addCourse(StudentCourse course) {
        this.courses[this.numCourses] = course;
        this.numCourses += 1;
    }
}
