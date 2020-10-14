package ArrayListExs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReverseOrder {

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < 10 ; i++) {
      String s = reader.readLine();
      int x = Integer.parseInt(s);
      list.add(x);

    }

    for (int i = list.size()-1; i >=0; i--) {
      System.out.println(list.get(i));

    }
  }
}
