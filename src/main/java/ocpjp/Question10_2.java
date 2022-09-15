package ocpjp;

public class Question10_2 {

  private int num = 1;
  private int div = 0;

  public void divide() {
    try {
      num = num / div;
      System.out.println("Exception");
    } catch (ArithmeticException ae) {
      num = 100;
    } catch (Exception e) {
      num = 200;
    } finally {
      num = 300;
    }
    System.out.println(num);
  }

  public static void main(String[] args) {

    Question10_2 test = new Question10_2();
    test.divide();
  }

}
