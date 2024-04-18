public class Foo {
    public static void main(String[] args) {
        M m = new M();
        //which are allowed?
        m.f();
        m.hello();
        m.g(); //not allowed
    }
}
