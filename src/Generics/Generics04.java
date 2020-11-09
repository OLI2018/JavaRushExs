package Generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Generics04 {

  public static void  main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<Integer>();

    while (true)
    {
      String s = reader.readLine();
      if (s.isEmpty()) break;
      list.add(Integer.parseInt(s));
    }
  }
}
