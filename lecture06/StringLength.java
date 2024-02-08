public class StringLength {

    public static void main(String[] args) {
        String foo = "hello world";
        System.out.println(foo.length());

        //find the index of 'e' (should be 2)
        int idx = foo.indexOf('e');
        System.out.println(idx + 1);
    }

}
