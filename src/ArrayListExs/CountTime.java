package ArrayListExs;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class CountTime {

  public static void main(String[] args) {

    System.out.println(getInsertTimeInMs(new ArrayList()));
    System.out.println(getInsertTimeInMs(new LinkedList()));
  }

  public static long getInsertTimeInMs(List list) {

    Date currentTime = new Date();
    long timeBefore = currentTime.getTime();

    insert10000(list);

    Date newTime = new Date();
    long timeAfter = newTime.getTime();
    long dif = timeAfter - timeBefore;

    return dif;
  }


  public static void insert10000(List list) {
    for (int i = 0; i < 10000; i++) {
      list.add(0, new Object());
    }
  }
}