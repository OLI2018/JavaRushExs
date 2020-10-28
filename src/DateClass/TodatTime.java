package DateClass;

import java.util.Date;

public class TodatTime {

  public static void main(String[] args) {

    Date currentTime =  new Date();
    int hours = currentTime.getHours();
    int mins = currentTime.getMinutes();
    int secs = currentTime.getSeconds();

    System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);
  }
}
