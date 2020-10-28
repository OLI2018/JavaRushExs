package DateClass;

import java.util.Date;

public class TimeCheck {

  public static void main(String[] args) throws Exception{

    Date startTime =  new Date();

    long endTime = startTime.getTime() + 5000;

    Date endDate = new Date(endTime);

    Thread.sleep(3000);

    Date currentTime = new Date();
    if (currentTime.after(endDate)) {
      System.out.println("End time!");
    }
  }
}
