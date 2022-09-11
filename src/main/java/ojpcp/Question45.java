package ojpcp;

public class Question45 {

  //參考Resource、Worker
  public static void main(String[] args) {
    Worker w1 = new Worker();
    Worker w2 = new Worker();
    Resource r1 = new Resource();
    Resource r2 = new Resource();
    new Thread(() -> {
      w1.work(r1, r2);
    }).start();
    new Thread(() -> {
      w2.work(r2, r1);
    }).start();
  }
}
