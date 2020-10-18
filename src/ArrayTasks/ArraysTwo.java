package ArrayTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArraysTwo {

  public static void main(String[] args) throws Exception {

   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   String [] words = new String[10];
   int [] numbers = new int [10];

    for (int i = 0; i < 10; i++) {
      words[i] =  reader.readLine();
    }

    for (int i = 0; i < words.length; i++) {
      String z = words[i];
      int m = z.length();
      numbers[i] = m;
    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}
