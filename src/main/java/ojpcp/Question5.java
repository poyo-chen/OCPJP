package ojpcp;

import java.util.Locale;

public class Question5 {

  public static void main(String[] args) {
//    Locale.setDefault(Locale.Category.FORMAT,"zh-cn"); //須放Locale
    Locale.setDefault(Locale.Category.FORMAT,Locale.CANADA);
    Locale.setDefault(Locale.SIMPLIFIED_CHINESE);
//    Locale.setDefault("en_CA");//須放Locale
//    Locale.setDefault("es",Locale.US);//須放Category,Locale
  }

}
