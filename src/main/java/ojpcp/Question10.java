package ojpcp;

import java.util.List;
import java.util.function.Function;

public class Question10 {

  public static void main(String[] args) {
    var num = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    //Function 有進有出<輸入型別,輸出型別>
    Function<Integer, Integer> f = n -> n * 2;
    StringBuilder sb = new StringBuilder();
    for (int a : num) {
      sb.append(f.apply(a));
      sb.append(" ");
    }
  }
}
