package vce815;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Question1 {

  public static void main(String[] args) {
    try {
      doA();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static void doA() throws IOException, IndexOutOfBoundsException {
    if (false) {
      throw new FileNotFoundException();
    } else {
      throw new IndexOutOfBoundsException();
    }
  }
}
