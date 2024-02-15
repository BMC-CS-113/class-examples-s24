import java.util.Scanner;

public class Backwards {

    //4. What should param be?
    public static void printBackwards(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        
        System.out.println(arr[arr.length-1]);

        int[] arr2 = new int[arr.length-1];
        arr2[0] = arr[1];
        arr2[1] = arr[2];

        printBackwards(arr2);

    }

    public static void main(String[] args) {
        //1. create a scanner
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];

        nums[0] = sc.nextInt();
        nums[1] = sc.nextInt();
        nums[2] = sc.nextInt();



    }

}
