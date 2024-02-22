public class CalculateSumLoop {
    //arr can be any length from 0 to MAX_ARR_SIZE;
    public static int calculateSum(int[] arr) {

        int sum = 0;
        int idx = 0;

        while (idx < arr.length) {
            sum = sum + arr[idx];
            //add to sum 
            idx = idx + 1;
        }

        return sum;
    } 

}
