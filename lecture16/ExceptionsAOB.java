public class ExceptionsAOB {


    public static void main(String[] args) {
        //Initialize an array
        int[] arr = {1, 2, 3};

        //Ask the user for an input index
        System.out.println("Please enter an index: ");
        String sIdx = System.console().readLine();

        int idx;
        try {
            idx = Integer.parseInt(sIdx);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("That's not an integer! Please enter a number");
            return;
        }

        //If the index is out of bounds print “oh no!” 
        //make sure an exception is not thrown 
        try {
            //code that might throw an exception
            System.out.println(arr[idx]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            //code to handle that exception
            System.out.println("oh no!");
        }

        
    }
}
