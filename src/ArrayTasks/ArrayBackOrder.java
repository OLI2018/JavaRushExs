package ArrayTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayBackOrder {

  public static void main (String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int [] list = new int [10];

    for (int i = 0; i < 10; i++) {

      String s = reader.readLine();
      list [i] = Integer.parseInt(s);

    }

    for (int i = list.length - 1 ; i >=0 ; i--) {

      System.out.println(list[i]);

    }

  }
}
