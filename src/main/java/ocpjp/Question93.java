package ocpjp;

import java.util.List;
import java.util.Optional;

public class Question93 {

  public static void main(String[] args) {
    var fruits = List.of("apple", "orange", "banana", "lemon");
//    Optional<String> result = fruits.stream().filter(f -> f.contains("n")).findAny();//回傳Optional
//    System.out.println(result);
//    fruits.stream().filter(f -> f.contains("n")).forEachOrdered(System.out::println);//並行串流 會印出orange banana lemon
    Optional<String> first = fruits.stream().filter(f -> f.contains("n")).findFirst();
    System.out.println("first = " + first);
//    boolean n = fruits.stream().anyMatch(f -> f.contains("n"));//回傳boolean
  }
}
