package ojpcp;

public class Question66 extends Foo {

  private void print() {
    System.out.println("Hello world!");
  }

  public void bar() {
    print();
  }

  public static void main(String[] args) {
    Question66 b = new Question66();
    b.foo();
    b.bar();
  }

}

class Foo {

  private void print() {
    System.out.println("Bonjour le monde!");
  }

  public void foo() {
    print();
  }
}
