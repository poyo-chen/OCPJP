package ocpjp;

public class Question70 extends Automobile {

  @Override
  void wheels() {
    System.out.println(4);
  }

  public static void main(String[] args) {
    Automobile ob = new Question70();
    ob.wheels();
  }
}

abstract class Automobile {

  abstract void wheels();
}