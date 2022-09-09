package ojpcp;

import java.util.Arrays;

public class Question20 {

  public static void main(String[] args) {
    int[] secA = {2, 4, 6, 8, 10};
    int[] secB = {2, 4, 8, 6, 10};
    int res1 = Arrays.mismatch(secA, secB); //比較第一個不同的位置
    System.out.println("res1 = " + res1);
    int res2 = Arrays.compare(secA, secB);  //逐一比較自然排序 前面大：1 後面大：-1 相等：0
    System.out.println("res2 = " + res2);
  }

}
