package ocpjp;

import java.util.Random;
import java.util.stream.DoubleStream;

public class Question33 {

  public static void main(String[] args) {
    var r = new Random();
    DoubleStream.generate(r::nextDouble).limit(100).forEach(System.out::print);
  }
}
