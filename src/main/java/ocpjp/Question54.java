package ocpjp;

public class Question54 {

  public static void main(String[] args) {
    AnotherClass ac = new AnotherClass();
    SomeClass sc = new AnotherClass();
//    ac = sc;  sc為父類別不可自動轉型為子類別
    sc.methodA();
    ac.methodA();
  }
}

class SomeClass {

  public void methodA() {
    System.out.println("SomeClass#methodA()");
  }
}

class AnotherClass extends SomeClass {

  public void methodA() {
    System.out.println("AnotherClass#methodA()");
  }
}