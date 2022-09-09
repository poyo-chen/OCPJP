package ojpcp;

import java.util.List;
import java.util.stream.Stream;

public class Question1 {

  public static void main(String[] args) {
    List widgets = List.of(new Widget("a", 19.55),
        new Widget("b", 31.55),
        new Widget("c", 55.55));
    Stream<Widget> widgetStream = widgets.stream();  //需宣告Stream型別
    widgetStream.filter(a ->a.getPrice() > 20.00)   //或將a強轉型
        .forEach(System.out::println);
  }


}

class Widget {

  String a;

  public String getA() {
    return a;
  }

  public void setA(String a) {
    this.a = a;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  double price;

  public Widget(String a, double price) {
    this.a = a;
    this.price = price;
  }
}