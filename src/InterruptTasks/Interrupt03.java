// Java Core,  6 уровень,  10 лекция
// А без interrupt слабо?

package InterruptTasks;

public class Interrupt03 {

  private static boolean isAliveRun = true;

  public static void main(String[] args) throws InterruptedException {

    Thread t = new Thread(new TestThread());
    t.start();

    Thread.sleep(3000);
    ourInterruptMethod();
  }

  public static void ourInterruptMethod() {

    isAliveRun = false;

  }

  public static class TestThread implements Runnable {
    public void run() {
      while (isAliveRun) {
        try {
          System.out.println("he-he");
          Thread.sleep(500);
        } catch (InterruptedException e) {
        }
      }
    }
  }
}



