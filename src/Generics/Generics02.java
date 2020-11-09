package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics02 {

  public static void main(String[] args) {

    Object obj = new Object("Olo");

    List list = new ArrayList<>();
    list.add("LA");
    list.add(10);
    list.add(obj);

    System.out.println(list);
  }

  static public class Object {

    public String name;

    Object (String name) {

      this.name = name;

    }

    public String toString(){
      return name;
    }
  }
}
