package Generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReverseOrderArray {

  public static void main(String[] args) throws IOException {

    ArrayList<String> list = new ArrayList<String>();

    BufferedReader reader = new  BufferedReader (new InputStreamReader(System.in));

    for (int i = 0; i < 5; i++) {
      String s = reader.readLine();
      list.add(s);
    }

    list.remove(2);

    for (int i = list.size()-1; i >=0 ; i--) {

      System.out.println(list.get(i));
    }
  }
}
