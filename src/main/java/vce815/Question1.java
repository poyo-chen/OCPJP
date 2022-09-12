package vce815;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <a href="https://vceguide.com/what-must-be-added-in-line-1-to-compile-this-class/">https://vceguide.com/what-must-be-added-in-line-1-to-compile-this-class/</a>
 **/
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
