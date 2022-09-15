package ocpjp;

public class Worker {

  public synchronized void work(Resource... resources) {
    for (int i = 0; i < 10; i++) {
      while (!resources[0].claim(this)){
        System.out.println("resource 0 not claim");
      }
      while (!resources[1].claim(this)){System.out.println("resource 1 not claim");}
      System.out.println("resource 1 release");
      resources[1].release();
      System.out.println("resource 2 release");
      resources[0].release();
    }
  }
}
