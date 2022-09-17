package vce815;

public class Question63 {

  int aCount;
  int bCount;
  int cCount;
  int dCount;

  Question63(int a, int b, int c, int d) {
//    setCCount(c) = c;
    b = b;
    setDCount(d);
    cCount = setCCount(c);
    aCount = a;
  }

  int setCCount(int c) {
    return c;
  }

  void setDCount(int d) {
    this.dCount = d;
  }

  @Override
  public String toString() {
    return "Question63{" +
        "aCount=" + aCount +
        ", bCount=" + bCount +
        ", cCount=" + cCount +
        ", dCount=" + dCount +
        '}';
  }

  public static void main(String[] args) {
    Question63 question63 = new Question63(1, 2, 3, 4);
    System.out.println(question63);
  }
}
