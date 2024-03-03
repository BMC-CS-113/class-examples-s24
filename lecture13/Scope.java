public class Scope {

    public static int foo(int x) {
        x = x * 10;
        return x+1;
    }
    
    public static void main(String[] args) {
        int x = 5;
        foo(x);
        
        //What will this print?
        System.out.println(x);

        x = foo(10);
        System.out.println(x);
    }
    
}
