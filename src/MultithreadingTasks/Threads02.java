// Вывод стек-трейса
// Java Core,  6 уровень,  3 лекция

package MultithreadingTasks;

public class Threads02 {

  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(new SpecialThread01());
    thread.start();

    System.out.println("*****************");

    for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
      System.out.println(element);
    }
  }

  public static class SpecialThread01 implements Runnable {

    @Override
    public void run() {

      for (StackTraceElement el : Thread.currentThread().getStackTrace())
      {
        System.out.println(el);
      }
    }
  }
}



