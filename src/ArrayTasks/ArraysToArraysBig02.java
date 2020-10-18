package ArrayTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysToArraysBig02 {

  public static void main(String[] args) throws Exception {

    BufferedReader reader = new  BufferedReader(new InputStreamReader(System.in));

    int [] list =  new int [20];
    int [] list01 = new int [10];
    int [] list02 = new int [10];

    for (int i = 0; i < 20; i++) {

      String s = reader.readLine();
      list[i] = Integer.parseInt(s);

    }

    for (int i = 0; i < list.length - 10; i++) {
      list01[i] = list [i];

    }

    for (int i = 10; i < list.length ; i++) {
      list02[i - 10] = list[i];

    }

    for (int i = 0; i < list02.length; i++) {
      System.out.println(list02[i]);

    }

    }

  }

