public class ExceptionsDiv {

    public static void main(String[] args) {
        //Ask the user for two numbers 
        String snum1 = System.console().readLine();
        String snum2 = System.console().readLine();

        try {
            int num1 = Integer.parseInt(snum1);
            int num2 = Integer.parseInt(snum2);

            System.out.println(num1 / num2);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("oh no! div by zero");
        } catch (java.lang.NumberFormatException e) {
            System.out.println("You didn't enter a number");
        } /*catch (....) {

        }*/

        //If the second num is 0 print “oh no!” 
        //make sure an exception is not thrown 

    }
}
