package ArrayListExs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MinMaxArray {

  public static void main(String[] args) throws Exception {

    int [] array = getInts ();

    int maximum = array [0];
    int minimum = array [0];

    for (int i = 0; i < array.length; i++) {
      if (maximum < array [i])
        maximum = array[i];
    }

    for (int i = 0; i < array.length; i++) {
      if (minimum > array [i])
        minimum = array[i];
    }
    System.out.println(maximum + " " + minimum);
  }


  public static int[] getInts() throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] list = new int[20];

    for (int i = 0; i < list.length; i++) {
      String s = reader.readLine();
      list[i] = Integer.parseInt(s);
    }

return list;
  }
}




