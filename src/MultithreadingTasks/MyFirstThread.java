// My first thread
// Java Core,  6 уровень,  3 лекция

package MultithreadingTasks;

public class MyFirstThread {

  public static void main(String[] args) {

    TestThread task = new TestThread();
    new Thread(task).start();
  }

  public static class TestThread implements Runnable {

    @Override
    public void run() {

      System.out.println("My first thread");
    }
  }
}


