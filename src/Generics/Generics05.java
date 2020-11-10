package Generics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Generics05 {

  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<Integer> list = new ArrayList<Integer>();

    list.add(1);
    list.add(2);
    list.add(11);
    list.add(3);
    list.add(15);

    for (int i = 0; i  < list.size();)
    {

      if (list.get(i) > 5)
        list.remove(i);
      else
        i++;


    }

    System.out.println(list);
  }
}
