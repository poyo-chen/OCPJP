package ojpcp;

public class Question11 {

  public static void main(String[] args) {
    new ConSub(4);
  }
}

class ConSuper {

  protected ConSuper() {
    this(2);
    System.out.println("1");
  }

  protected ConSuper(int a) {
    System.out.println(a);
  }
}

