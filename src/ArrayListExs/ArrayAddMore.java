package ArrayListExs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayAddMore {

  public static void main(String[] args) throws Exception {

    ArrayList<String> list = new ArrayList<String> ();

    BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

    for (int i = 0; i < 5 ; i++) {

      String s = reader.readLine();
      list.add(s);

    }

    for (int i = 0; i < 13; i++) {

      String last = list.get(list.size()-1);
      list.remove(list.size()-1);
      list.add(0, last);
    }

    for (int i = 0; i < list.size(); i++) {

      System.out.println(list.get(i));

    }
  }
}

