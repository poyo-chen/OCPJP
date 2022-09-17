package vce815;

public class Question72 {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder(5);
    sb.append("WOEDY");
    sb.insert(0, ' ');
    sb.replace(3, 5, "LL");
    sb.insert(6, "COW");
    sb.delete(2, 7);
    System.out.println(sb.length());
    System.out.println(sb);
  }
}
