public class Driver {

    public static void main(String[] args) {
        //Which toStrings will be called?

        CSStudent s1 = new CSStudent("eliz", 6, "edinella");
        System.out.println(s1);
        System.out.println(s1.getDatesOfFinals());

        Student s2 = new Student("Cinnabon", 1);
        System.out.println(s2);

        Student s3 = new CSStudent("Hannah", 50101, "hchow");
        System.out.println(s3); 

        PhysicsStudent s4 = new PhysicsStudent("Dianna", 99, 15);
        System.out.println(s4);


        Student s5 = new PhysicsStudent("Steve", 99000, 1);
        System.out.println(s5);



    }
}
