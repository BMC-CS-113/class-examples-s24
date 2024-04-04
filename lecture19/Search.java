public class Search {

    public static boolean exists(int[] arr, int target) {
        //search for target in arr

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] myarr = {1, 100, 99, 15, 12, 7, 15, 2};

        System.out.println(exists(myarr, 12));
        System.out.println(exists(myarr, 0));

    }
}
