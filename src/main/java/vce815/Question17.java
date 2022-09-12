package vce815;

import java.nio.file.Path;
import java.util.Collection;

public class Question17 {


}
interface A{
  public Iterable a();
}
interface B extends A{
  public Collection a();
}
interface C extends A{
  public Path a();
}
//同時繼承BC，BC非父子關係，卻有相同方法名稱
//interface D extends C,B{
//
//}