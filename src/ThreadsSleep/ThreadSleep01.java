// Java Core,  6 уровень,  7 лекция
// Часы

package ThreadsSleep;

public class ThreadSleep01 {

  public static volatile boolean isStopped = false;

  public static void main(String[] args) throws InterruptedException {
    Clock clock = new Clock();
    Thread.sleep(2000);
    isStopped = true;
    System.out.println("The clock has to be stopped");
    Thread.sleep(2000);
    System.out.println("Double-check");
  }

  public static class Clock extends Thread {
    public Clock() {
      setPriority(MAX_PRIORITY);
      start();

    }

    public void run() {
      try {
        while (!isStopped) {
          printTikTak();
        }
      } catch (InterruptedException e) {
      }
    }

    private void printTikTak() throws InterruptedException {
      Thread.sleep(500);
      System.out.println("Tik");
      Thread.sleep(500);
      System.out.println("Tak");
    }
  }
}



