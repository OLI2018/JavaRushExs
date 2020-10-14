package ArrayListExs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListMinCollection {

  public static void main(String[] args)throws Exception {

    List<Integer> integerList = getIntegerList();
    System.out.println(getMinimum(integerList));
  }

  public static int getMinimum(List<Integer> array) {

    int min = array.get(0);
    for (int i = 1; i < array.size(); i++) {
      if (array.get(i) < min)
      {
        min = array.get(i);
      }
    }

    return min;
  }

  public static List<Integer> getIntegerList() throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List <Integer> list = new ArrayList<>();

    for (int i = 0; i < 5; i++) {

      String s = reader.readLine();
      int num = Integer.parseInt(s);
      list.add(num);
    }
    return list;
  }
}
