package ojpcp;

public class Question61 {

  public static void main(String[] args) {
    Person person = null;
    checkPerson(person);//沒有接值
    System.out.println(person);
    person = new Person("Marry");
    checkPerson(person);
    System.out.println(person);
  }

  public static Person checkPerson(Person p) {
    if (p == null) {
      p = new Person("Joe");
    } else {
      p = null;
    }
    return p;
  }
}

class Person {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String toString() {
    return name;
  }
}