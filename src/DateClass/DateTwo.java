package DateClass;


import java.util.Date;

public class DateTwo {

  public static void main(String[] args) throws Exception {

    Date currentDate =  new Date();

    Thread.sleep(3000);

    Date newTime = new Date();

    long msDelay = newTime.getTime() - currentDate.getTime();
    System.out.println("Time distance is: " + msDelay + " in ms");


  }
}
