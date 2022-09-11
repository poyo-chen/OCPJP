package ojpcp;

public class Resource {

  public Worker owner;

  public synchronized boolean claim(Worker worker) {
    if (owner == null) {
      owner = worker;
      return true;
    } else return false;
  }

  public synchronized void release() {
    owner = null;
  }
}
