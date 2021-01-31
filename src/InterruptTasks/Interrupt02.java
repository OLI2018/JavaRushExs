// Снова interrupt
// Java Core,  6 уровень,  10 лекция

package InterruptTasks;

public class Interrupt02 {

  public static void main(String[] args) throws InterruptedException {

    TestThread testThread = new TestThread();
    testThread.start();

    testThread.interrupt();
  }


  public static class TestThread extends Thread {

    @Override
    public void run() {

    }
  }
}


