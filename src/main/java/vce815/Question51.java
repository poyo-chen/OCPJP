package vce815;

import java.util.ArrayList;
import java.util.Arrays;

public class Question51 {

  public static void main(String[] args) {
    String[] fruitNames = {"apple", "orange", "grape", "lemon", "apricot", "watermelon"};
    var fruits = new ArrayList<>(Arrays.asList(fruitNames));
    fruits.sort((var a, var b) -> -a.compareTo(b));
    fruits.forEach(System.out::println);
  }

}
