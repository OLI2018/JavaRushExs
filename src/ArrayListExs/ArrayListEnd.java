package ArrayListExs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListEnd {

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> list = new ArrayList<String>();

    String m = "end";

    while (true){
      String s = reader.readLine();
      if (s.equals(m) )
        break;
      list.add(s);
    }

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}

