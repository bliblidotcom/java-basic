package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class InterruptedRunnable implements Runnable {

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + ": start");
    try {
      Thread.sleep(10000);
    } catch (Exception ex) {
      System.out.println(Thread.currentThread().getName() + ": Interrupted");
    }
    System.out.println(Thread.currentThread().getName() + ": finished");
  }
}
