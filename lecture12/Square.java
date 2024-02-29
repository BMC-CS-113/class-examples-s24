public class Square {

    public static void main(String[] args) {
        //prompt the user: "Enter a size"
        String num = System.console().readLine();
        int intNum = Integer.parseInt(num);

        for (int i=1; i<=intNum; i++) {
            System.out.println();
            for (int j=1; j<=intNum; j++) {
                System.out.print("*");
                //??printing
            }

        }

        System.out.println();
        //nested loops to print a square of the input size
    }

}
