package ocpjp;

public class Question2 {

  public static void main(String[] args) {
    char letter = 'd';

    int i = 0;
    switch (letter) {
      case 'a':
        i++;
        break;
      case 'b'://由此進入
        i++;
      case 'c' | 'd':
        i++;
      case 'e':
        i++;
        break;//到此跳出
      case 'f':
        i++;
        break;
      default:
        System.out.println(letter);
    }
    System.out.println("i = " + i);
  }
}
