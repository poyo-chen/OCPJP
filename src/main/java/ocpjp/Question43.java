package ocpjp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Question43 {

  public static void main(String[] args) {
    try {

      var lines=Files.lines(Paths.get("INTPUT"));
      lines.map(l -> l.toUpperCase()).forEach(line -> {
        try {
          Files.write(Paths.get("outputFile_to_path"),
              line.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      });
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}
