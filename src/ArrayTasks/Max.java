package ArrayTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Max {

  public static void main(String[] args) throws Exception {
    int [] array = initializeArray();
    int max = max (array);
    System.out.println(max);
  }

  public static int []  initializeArray () throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int [] list = new int[5];
    for (int i = 0; i < list.length; i++) {

      String s = reader.readLine();
      list [i] = Integer.parseInt(s);

    }

    return list;
  }

  public static int max (int [] array) {
    int max = array [0];
    for (int i = 1; i < array.length; i++) {
      if (max < array [i])
        max = array[i];
    }
    return max;
  }
}
