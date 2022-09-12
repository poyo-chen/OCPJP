package vce815;

public class Question2 {



  public static void main(String[] args) {
    int x = 12_34;
    short sh = (short) 'A';
    //  String contact# ="(+2)(999)(232)";//不可有#
//  boolean true = (4 == 4); //true保留字不可宣告
//  float y=1.99; //浮點數需加F，預設為d
    int[][] e = {{1, 1}, {2, 2}};  //此為二維陣列
    byte b = 10;
//    char c=b; byte不可自動轉型為char
    System.out.println("x = " + x);
    System.out.println("sh = " + sh);
    System.out.println("e = " + e);
    System.out.println("b = " + b);
  }

}
