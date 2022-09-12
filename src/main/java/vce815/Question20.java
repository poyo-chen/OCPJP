package vce815;

public class Question20 {

  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println(i + ")." + args[i]);
      switch (args[i]) {
        case "one":
          continue;
        case "two":
          i--;
          continue;
        case "three":
          break;
      }
    }
  }
}
