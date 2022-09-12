package vce815;

public class Question32 {

  public static void main(String[] args) {
    int x = 0;
    do {
      x++;
      if (x == 1) {
        continue;
      }
      System.out.println(x);
    } while (x < 1);
  }
}
