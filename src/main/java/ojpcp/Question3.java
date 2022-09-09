package ojpcp;

import java.util.List;
import java.util.stream.IntStream;

public class Question3 {

  public static void main(String[] args) {
    final List<String> fruit = List.of("oragnge", "apple", "lemmon", "raspberry");
    final List<String> type = List.of("juice", "pie", "ice", "tart");
    final var stream = IntStream.range(0, Math.min(fruit.size(), type.size()))
        .mapToObj(i -> fruit.get(i) + " " + type.get(i));
    stream.forEach(System.out::println);
  }

}
