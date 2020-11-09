package Generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class doubleWords {
  public static void main(String[] args) throws IOException {

    ArrayList<String> list = new ArrayList<>();

    BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
    for (int i = 0; i < 10; i++) {

      String s = reader.readLine();
      list.add(s);
    }

    ArrayList<String> result = doubleValues(list);

    for (int i = 0; i < result.size(); i++) {
      System.out.println(result.get(i));

    }
  }

  public static ArrayList<String> doubleValues(ArrayList<String> list) {


    for (int i = 0; i < list.size(); i = i +2) {
      String str = list.get(i);
      list.add(i,str);
    }
    return list;
  }
}

