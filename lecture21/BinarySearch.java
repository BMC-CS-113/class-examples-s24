public class BinarySearch{

    public static int binarySearch(int[] data, int target, int low, int high) {
        //3. stopping condition : target is not in data
        if (high < low) {
            return -1;
        }

        //1. calculate mid value
        int mid = (low + high) / 2;
        int midElem = data[mid];

        //2. handle 3 cases: equal to, lesser than, greater than
        if (midElem == target) {
            return mid;
        } else if(target < midElem) {
            //search LEFT portion of the list
            return binarySearch(data, target, low, mid-1);
        } else { //target > midElem
            return binarySearch(data, target, mid+1, high);
        }
    }

    public static int binarySearch(int[] data, int target) {
        return binarySearch(data, target, 0, data.length);
    }

}
