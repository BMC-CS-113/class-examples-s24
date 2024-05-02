public class Q1 {

    public static int numOccurs(int[] a, int[] b) {
        return numOccurs(a, b, 0, 0);     
    }

    public static int numOccurs(int[] a, int[] b, int ia, int ib) {
        if (ia >= a.length) {
            return 0;
        }  

        if (ia < a.length && ib < b.length && a[ia] == b[ib]) {
            return 1 + numOccurs(a, b, ia, ib+1);
        } else if (ib >= b.length) {
            return numOccurs(a, b, ia+1, 0);
        } else {
            return numOccurs(a, b, ia, ib+1);
        }
    }

    public static void main(String[] args) {
        assert numOccurs(new int[]{2, 4, 6}, new int[]{1, 2, 3, 4, 5, 6}) == 3;
        assert numOccurs(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7}) == 0;
        assert numOccurs(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3}, new int[]{3}) == 3;
    }

}
