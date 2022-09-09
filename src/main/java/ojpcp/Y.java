package ojpcp;

import java.util.Map;

public class Y extends X {

  public void set(Map<String, String> map) {
//    super.set(map);
    set(map);//呼叫自己
    set(map.values());//Collection<String> 呼叫X 的set
//    map.forEach((k,v)->set(v));  這是set(String)
  }
}
