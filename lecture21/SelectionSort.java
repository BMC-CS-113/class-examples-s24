public class SelectionSort {

    public static void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void selectionSort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            //i is the end index of the cur sorted portion 

            int unsortedStart = i;
            //find the min element in the unsorted portion

            int minIdx = i; //index of cur minimum value

            for (int j=unsortedStart; j<arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            swap(arr, unsortedStart, minIdx);
            
            //swap min with the first element in unsorted
        }

    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        printArr(arr);
    }

}
