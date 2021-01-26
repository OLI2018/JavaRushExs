// Java Core,  6 уровень,  3 лекция
// My second thread

package MultithreadingTasks;

public class MySecondThread {

  public static void main(String[] args) {
    TestThread01 thread = new TestThread01();
    thread.start();
  }

  public static class TestThread01 extends Thread{

    static
    {
      System.out.println("it's a static block inside TestThread");
    }

    @Override
    public void run() {
      System.out.println("it's a run method");
    }
  }
}



