package ArrayListExs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArraySort {

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] array = new int[20];
    for (int i = 0; i < array.length; i++) {
      array[i] = Integer.parseInt(reader.readLine());
    }

    sort(array);

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);

    }

    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);
    System.out.println(array[3]);
    System.out.println(array[4]);
  }

  public static void sort(int[] array) {

    for (int i = 0; i < array.length; i++) {
      int max = array[i];
      int max_index = i;

      for (int j = 1 + i; j < array.length; j++) {
        if (array[j] > max) {
          max = array[j];
          max_index = j;
        }
      }

        if (i != max_index)
        {
          int temp = array[i];
          array [i] = array[max_index];
          array[max_index] = temp;
        }
      }

    }


}
