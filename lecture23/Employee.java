public class Employee {
    // TODO 1: instance variable String msg that can only be accessed inside this class
    private String msg;

    public Employee(String msg) {
        this.msg = msg;
    }
    /*
     * TODO 2: create a method void introduce() - Prints msg. 
     * code outside of the class should be able to call introduce()
     */

    public void introduce() {
        System.out.println(msg);
    }

}
