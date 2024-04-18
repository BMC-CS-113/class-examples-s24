public class Manager extends Employee {
    //TODO 3: Extend the Employee class to create a Manager class 

    public Manager(String msg) {
        super(msg);
    }

    /*
     *
     * TODO 4: add the following additional method:
     *   void manage() - Prints "I am managing tasks."
     *   Only Manager and Executive should be able to call manage()
     */

    protected void manage() {
        System.out.println("I am managing tasks");
    }
}
