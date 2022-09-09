package ojpcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question6 {

  //印出Input後 等待輸入
  public static void main(String[] args) {
    try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.println("Input ");
      String inpput = in.readLine();
      System.out.println("Echo: " + inpput);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
