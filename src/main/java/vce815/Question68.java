package vce815;

public class Question68 {

  public static void main(String[] args) {
    EularInterface myEularInterface;
//    myEularInterface = () -> "2.7182";  實作錯誤 須回傳double
  }
}

interface EularInterface {

  double getEularValue();
}