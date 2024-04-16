public class Equals {

    public static void main(String[] args) {
        String st1 = new String("hello");
        String st2 = new String("hello");

        //What will be printed?
        System.out.println(st1 == st2); //false
        System.out.println(st1.equals(st2)); //true

        Student s = new Student("Lyla", "CS");

        Instructor i = new Instructor("Elizabeth", "Park", 205);
        StudentCourse course = new StudentCourse("CS1", "CS", i, 3.5, 'S', 2024);
        s.addCourse(course);

        Student s2 = new Student("Lyla", "CS");
        s2.addCourse(course);

        //What will these print ??
        System.out.println(s == s2); //false

        //Let's take a look at Student .equals()
        System.out.println(s.equals(s2));
        System.out.println(s.equals(i));

    }
}
