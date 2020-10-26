package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapCat {

  public static void main(String[] args) throws Exception {

    String[] cats = new String[] {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

    Map<String, Cat> map = addCatsToMap(cats);

    for (Map.Entry<String, Cat> pair : map.entrySet()) {
      System.out.println(pair.getKey() + " - " + pair.getValue());
    }
  }

  public static Map<String, Cat> addCatsToMap(String[] cats) {

    Map<String, Cat> map = new HashMap<String, Cat>();

    for (int i = 0; i < cats.length; i++) {
      map.put(cats[i], new Cat(cats[i]));

    }

    return map;
  }


  public static class Cat {
    String name;

    public Cat(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return name != null ? name.toUpperCase() : null;
    }
  }
}
