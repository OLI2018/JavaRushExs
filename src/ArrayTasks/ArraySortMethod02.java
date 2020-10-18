package ArrayTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraySortMethod02 {

  public static void main(String[] args) throws Exception {

    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
    int [] list = new int [10];

    for (int i = 0; i < 10; i++) {

      String s =  reader.readLine();
      list [i] = Integer.parseInt(s);

    }
    Arrays.sort(list);

    System.out.println(Arrays.toString(list));

  }
}
