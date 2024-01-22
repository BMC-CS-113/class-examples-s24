public class Test {
    
    public static void main(String[] args) {
        Counter c1 = new Counter(10);
        Counter c2 = c1;

        c1.inc();
        System.out.println("c1 count "+ c1.count);
        System.out.println("c2 count "+ c2.count);
    }

}
