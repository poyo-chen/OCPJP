package ojpcp;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Question98 {

  public static void main(String[] args) {
    List<String> list1 = new LinkedList<>();
    Set<String> hs1 = new HashSet<>();
    String[] v = {"a", "b", "c", "b", "a"};
    for (String s : v) {
      list1.add(s);
      hs1.add(s);
    }
    System.out.println(hs1.size() + " " + list1.size() + " ");
    HashSet hs2 = new HashSet(list1);
    LinkedList list2 = new LinkedList(hs1);
    System.out.println(hs2.size() + " " + list2.size());
  }
}
