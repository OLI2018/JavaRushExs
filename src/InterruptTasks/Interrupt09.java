// Взаимная блокировка
// Java Core,  6 уровень,  13 лекция

package InterruptTasks;

public class Interrupt09 {

  static Thread t1 = new T1();
  static Thread t2 = new T2();

  public static void main(String[] args) throws InterruptedException {

    t1.start();
    t2.start();
    t1.interrupt();

  }

  public static class T1 extends Thread {
    @Override
    public void run() {
      try {
        t2.join();
        System.out.println("T1 finished");
      } catch (InterruptedException e) {
        System.out.println("T1 was interrupted");
      }
    }
  }

  public static class T2 extends Thread {
    @Override
    public void run() {
      try {
        t1.join();
        System.out.println("T2 finished");
      } catch (InterruptedException e) {
        System.out.println("T2 was interrupted");
      }
    }
  }
}


