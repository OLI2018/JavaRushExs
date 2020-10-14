package ArrayListExs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class minString {

  public static void main(String[] args) throws Exception {

    ArrayList <String> list = new ArrayList<String>();

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 5 ; i++) {
      String s = reader.readLine();
      list.add(s);
    }

    String min = list.get(0);
    int m = min.length();

    for (int i = 0; i < list.size(); i++) {
      String str = list.get(i);
      if (str.length() < m )
        m = str.length();

    }

      for (int i = 0; i < list.size(); i++) {
        if (list.get(i).length() == m) {
          System.out.println(list.get(i));
        }
      }
    }
  }


