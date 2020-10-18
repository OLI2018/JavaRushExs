package ArrayTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysToArraysBig01 {

  public static void main(String[] args) throws Exception {

    int [] list = new int [10];

    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 10; i++) {

      String s =  reader.readLine();
      list[i] = Integer.parseInt(s);

    }

    int [] list01 = Arrays.copyOf(list, 5);
    int [] list02 = Arrays.copyOfRange(list, 5, 10);

    System.out.println(Arrays.toString(list02));

  }
}
