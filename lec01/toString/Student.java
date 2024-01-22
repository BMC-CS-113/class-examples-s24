public class Student {

  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() 
  {
    return "My name is " + name;
  }


  public static void main(String[] args) {
    Student s = new Student("Cinnabon", 3);
    //TODO: What wil this print?
    System.out.println(s);
  }

}
