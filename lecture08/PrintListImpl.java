public class PrintList {

    public static void printList(int[] arr, int index) {
        if (index == arr.length) {
           return;
        }

        System.out.println(arr[index]); 
        printList(arr, index+1);

    }

    public static void main(String[] args) {
        int[] arr = {7, 9, -1};
        printList(arr, 0);

    }
}
