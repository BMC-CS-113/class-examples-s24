public class BubbleSort {

    public static void printArr(int[] arr) {
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int i, int j, int[] L) {
        //TODO 1: swap elements in slots i and j
        int tmp = L[i];
        L[i] = L[j];
        L[j] = tmp;
    }

    public static void sort(int[] L) {
        int n = L.length;

        //int count = 0;
        //TODO 3: outer scan...
        for (int i=0; i<n; i++) {

            //TODO 2: for each pair, check the adjacent elements
            for (int j=0; j<n-1-i; j++) {
                int cur = L[j];
                int next = L[j+1];
                //compare and swap if needed

                if (cur > next) {
                    swap(j, j+1, L);
                }
            }
            //count += 1;
        }
    }

    public static void main(String[] args) {
        int[] L = {10, 4, 3, 0, 11, 8};

        System.out.println("Before sorting");
        printArr(L);

        System.out.println("After sorting");
        sort(L);
        printArr(L);


    }

}
