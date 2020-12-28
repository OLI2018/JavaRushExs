package Initialization;

import java.util.Date;

public class Initialization03 {

  static Date timeStamp;

  static {

    timeStamp = new Date();

    System.out.println("Объект еще не создан, а статический блок уже выполнен");
    System.out.println("Время запуска программы " + timeStamp.toString());
  }

  public Initialization03() {
    System.out.println("Объект создан");
    System.out.println("Вермя запуска программы " + timeStamp.toString());
  }

  public static void main(String[] args) {

    Initialization03 initialization03 = new Initialization03();
  }
}
