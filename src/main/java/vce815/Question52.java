package vce815;

public class Question52 {

  public static void main(String[] args) {
      String s1=new String("ORACLE");
      String s2="ORACLE";
      String s3=s1.intern();
    System.out.println(s1==s2);
    System.out.println(s2==s3);
    System.out.println(s1==s3);
  }
}
