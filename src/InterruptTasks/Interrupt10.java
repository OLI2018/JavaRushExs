// Java Core,  6 уровень,  13 лекция
// Создание по образцу

package InterruptTasks;

public class Interrupt10 {


  public static int number = 5;

  public static void main(String[] args) {

    new Thread(new CountdownRunnable(), "Уменьшаем").start();
    new Thread(new CountUpRunnable(), "Увеличиваем").start();
  }

  public static class CountUpRunnable implements Runnable {

    private int countIndexUp = 1;

    public void run() {
      try {

        while (true) {
          System.out.println(toString());
          countIndexUp = countIndexUp + 1;
          Thread.sleep(500);
          if (countIndexUp == number + 1) return;

        }
      } catch (InterruptedException e) {
      }
    }

    public String toString() {
      return Thread.currentThread().getName() + ": " + countIndexUp;
    }
  }


  public static class CountdownRunnable implements Runnable {
    private int countIndexDown = Interrupt10.number;

    public void run() {
      try {
        while (true) {
          System.out.println(toString());
          countIndexDown -= 1;
          if (countIndexDown == 0) return;
          Thread.sleep(500);
        }
      } catch (InterruptedException e) {
      }
    }

    public String toString() {
      return Thread.currentThread().getName() + ": " + countIndexDown;
    }
  }
}



