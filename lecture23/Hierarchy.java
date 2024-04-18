public class Hierarchy {
  static class Animal {}
  static class Bird extends Animal {}
  static class Parrot extends Bird {};

  public static void main(String[] args) {
    //which of these will fail to compile if any?
    Animal a1 = new Bird(); 
    Bird b2 = new Animal();  //no
    Animal a2 = new Parrot();
    Bird b3 = new Parrot();
    Parrot p1 = new Bird();  //no
    Parrot p2 = new Animal(); //no
  }
}
