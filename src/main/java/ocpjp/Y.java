package ocpjp;

import java.util.Map;

public class Y extends X {

  public void set(Map<String, String> map) {
//    super.set(map);
    set(map);//呼叫自己
    set(map.values());//Collection<String> 呼叫X 的set
    super.set(map.values());
//    map.forEach((k,v)->set(v));  這是set(String)
  }
}
