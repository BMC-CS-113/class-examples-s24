public class Executive extends Manager {

    //TODO 5:  Extend the Manager class to create an Executive class 

    public Executive(String msg) {
        super(msg);
    }

    /* TODO 6: add the following additional method:
        void working() - Prints manage() as well as "I am making decisions for the company." 
        code outside of the class should be able to call working() 
    */

    public void working() {
        manage();
        System.out.println("I am making decisions for the company");
    }
}
