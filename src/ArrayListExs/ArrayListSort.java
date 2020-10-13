package ArrayListExs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayListSort {

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] array = new int[5];
    for (int i = 0; i < 5; i++) {
      array[i] = Integer.parseInt(reader.readLine());
    }

    sort(array);

    for (int x : array) {
      System.out.println(x);
    }
  }

  public static void sort(int[] array) {

    boolean sorted = false;
    int temp;
    while(!sorted) {
      sorted = true;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] < array[i+1]) {
          temp = array[i];
          array[i] = array[i+1];
          array[i+1] = temp;
          sorted = false;
        }
      }
    }
  }
}
