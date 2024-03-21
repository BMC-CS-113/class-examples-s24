public class Rectangle {

    public static void main(String[] args) {
        //prompt the user: "Enter a width"
        System.out.print("Enter a width: ");
        int w = Integer.parseInt(System.console().readLine());

        //prompt the user: "Enter a height"
        System.out.print("Enter a height: ");
        int h = Integer.parseInt(System.console().readLine());

        //nested loops to print a rectangle of the input size
        //h lines with w stars in each 

        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
