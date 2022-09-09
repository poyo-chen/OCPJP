package ojpcp;

//題目沒有import 故為compilation fail
import java.io.File;

public class Question9 {

  public static void main(String[] args) {
    checkConfiguration("App,config");
    System.out.println("Configuration is OK");
  }

  public static void checkConfiguration(String filename) {
    File file = new File(filename);
    if (!file.exists()) {
      throw new Error("Fatal Error:Configuration File, " + filename + ", is missing");
    }
  }
}
