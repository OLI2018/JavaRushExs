package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapHashExm {

  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>();

    map.put("apple", 1);
    map.put("pineapple", 10);
    map.put("tree", 23);
    map.put("apple", 2);
    map.put("rrr", 32);
    map.put("rtyuio", 98);


    System.out.println (map);
  }
}
