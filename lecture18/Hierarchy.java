public class Hierarchy {
  static class A {}
  static class B extends A {}
  static class C extends B {};

  public static void main(String[] args) {
    //which of these will fail to compile if any?
    A a1 = new B();
    B b1 = new A(); //not allowed
    A a2 = new C();
    B b2 = new C();
    C c1 = new B(); //not allowed
    C c2 = new A(); //not allowed
  }
}
