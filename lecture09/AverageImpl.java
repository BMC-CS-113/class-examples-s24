import java.util.Scanner;

public class AverageImpl {

    public static double avg(double total, int numItem) {

        return total / (double) numItem;
    }

    
    public static double sum(double[] values) {
        return values[0] + values[1] + values[2] + values[3] + values[4];
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please give me a number: "); 
        double v1 = sc.nextDouble();

        System.out.print("Please give me a number: "); 
        double v2 = sc.nextDouble();

        System.out.print("Please give me a number: "); 
        double v3 = sc.nextDouble();

        System.out.print("Please give me a number: "); 
        double v4 = sc.nextDouble();

        System.out.print("Please give me a number: "); 
        double v5 = sc.nextDouble();

        double[] vals =  {v1, v2, v3, v4, v5};

        double total = sum(vals);
        double average = avg(total, 5);

        System.out.printf("\nThe average of your numbers is: %.1f \n", average);
    }

}

