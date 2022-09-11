package ojpcp;

import java.util.Optional;

public class Question62 {

  public static void main(String[] args) {
    Optional<String> value = createValue();
    String str = value.orElse("Duke");
    System.out.println(str);
  }

  static Optional<String> createValue() {
    String s = null;
    return Optional.ofNullable(s);
  }
}
