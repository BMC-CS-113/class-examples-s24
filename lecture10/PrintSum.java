public class PrintSum {
    //assume arr has 5 elements
    public static int calculateSum(int[] arr) {
        int sum = 0;
        sum += arr[0];
        sum += arr[1];
        sum += arr[2];
        sum += arr[3];
        sum += arr[4];
        return sum;
    } 

    public static void main(String[] args) {
        //TODO: initialize an array with 5 elements named x

        int sum = calculateSum(x);

        System.out.println("Summing array " + x);
        System.out.println("Sum: " + sum);
    }
}
