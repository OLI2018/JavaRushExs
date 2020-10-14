package ArrayListExs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class maxString {

  private static ArrayList<String> strings;

  public static void main(String[] args) throws Exception {

    strings = new ArrayList<String>();

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 5; i++) {

      String str = reader.readLine();
      strings.add(str);
    }

    String max = strings.get(0);
    int lenghtMax = max.length();

    for (int i = 0; i < strings.size(); i++) {
      if (strings.get(i).length() > lenghtMax)
        lenghtMax = strings.get(i).length();

    }

    for (int i = 0; i < strings.size(); i++) {
      if (strings.get(i).length() == lenghtMax)
        System.out.println(strings.get(i));

    }

  }
}



