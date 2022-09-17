package vce815;

public class Question50 {

  public static void main(String[] args) {
    int x = 0;
    while (x < 10) {
      System.out.print(x++);
    }
    System.out.println();
    int b = 0;
    for (; b < 10; ) {
      System.out.print(++b);
    }
    System.out.println();
//    for(c;c<10;c++){
//      System.out.print(c);
//    }
    System.out.println();
    for (int d = 0; d < 10; ) {
      System.out.print(d);
      d++;
    }
    System.out.println();
    for (int e = 0; ; e++) {
      System.out.print(e);
      if (e == 10) {
        break;
      }
    }
  }
}
