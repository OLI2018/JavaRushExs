package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExm {

  public static void main(String[] args) {

    Map<String, Integer> map = new TreeMap<>();

    map.put("a", 1);
    map.put("d", 10);
    map.put("c", 23);
    map.put("y", 32);
    map.put("z", 1000);
    map.put("b", 32);


     System.out.println(map);
  }

}
