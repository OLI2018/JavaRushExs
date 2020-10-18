package ArrayTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArraysEven {

  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] list =  new int[15];

    for (int i = 0; i < 15; i++) {

      String s = reader.readLine();
      list[i] = Integer.parseInt(s);
    }

    int sum1 = 0;
    for (int i = 0; i <  list.length; i = i + 2) {
      sum1 = sum1 + list[i]; // четные дома
    }

    int sum2 = 0;
    for (int i = 1; i < list.length; i = i + 2) {
      sum2 = sum2 + list[i]; // не четные дома
    }


    if (sum1 > sum2) {
      System.out.println("В домах с четными номерами проживает больше жителей.");

    }
    else

      System.out.println("В домах с нечетными номерами проживает больше жителей.");
  }
}

