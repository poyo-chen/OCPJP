package ocpjp;

public class Question38 {

  public static void main(String[] args) {
    int i = 1;
    for (String arg : args) {
      System.out.println((i++) + ")" + arg);
    }
  }
}
