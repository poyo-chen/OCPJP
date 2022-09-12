package vce815;

public class Question9 {

  public static void main(String[] args) {
    Person p = new Person();
    p.setName("WHO");
    System.out.println(p);
  }
}

class Person {

  private String name;

  public void setName(String name) {
    String title = "Dr. ";
    name = title + name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        '}';
  }
}
