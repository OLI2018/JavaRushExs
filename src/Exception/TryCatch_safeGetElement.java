package Exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TryCatch_safeGetElement {

  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 20; i++) {
      int number = Integer.parseInt(reader.readLine());
      list.add(number);
    }

    System.out.println(safeGetElement(list, 5, 1));
    System.out.println(safeGetElement(list, 20, 7));
    System.out.println(safeGetElement(list, -5, 9));
  }

  public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {

    Integer value = null;
    try {
      value = list.get(index);
      return value;
    } catch (Exception e) {
      if (e != null) {
        return defaultValue;
      }

    }
    return value;
  }

}


