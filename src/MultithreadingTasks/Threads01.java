// Java Core,  6 уровень,  3 лекция
// Список и нити

package MultithreadingTasks;

import java.util.ArrayList;
import java.util.List;

public class Threads01 {

  public static volatile List<Thread> list = new ArrayList<Thread>(5);

  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {

      Thread t = new Thread(new SpecialThread());
      list.add(t);
    }
  }

  public static class SpecialThread implements Runnable {

    public void run() {
      System.out.println("it's a run method inside SpecialThread");
    }
  }
}



