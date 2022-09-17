package vce815;

import java.util.Iterator;
import java.util.List;

public class Question65 {

  public static void foo(Object obj) {
    System.out.println(obj);
  }

  public static void main(String args[]) {
    {
      Iterator iter = List.of(1, 2, 3).iterator();
      while (iter.hasNext()) {
        foo(iter.next());
      }

      Iterator iter2 = List.of(1, 2, 3).iterator();
      while (iter.hasNext()) {
        foo(iter2.next());
      }
    }

    for (Iterator iter = List.of(1, 2, 3).iterator(); iter.hasNext(); ) {
      foo(iter.next());
    }
//C
//    for (Iterator iter2 = List.of(1, 2, 3).iterator(); iter.hasNext(); ) {
//      foo(iter2.next());
//    }
  }
}
