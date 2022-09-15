package vce815;

public class Question46 {
  public void analyze(Object[] o){
    System.out.println("I am an object array");
  }
  public void analyze(long[] o){
    System.out.println("I am an array");
  }
  public void analyze(Object o){
    System.out.println("I am an object ");
  }

  public static void main(String[] args) {
    int[] nums=new int[10];
    new Question46().analyze(nums);
  }
}
