package ArrayListExs;

import java.util.ArrayList;

public class ArrayList01 {

  public static void main(String[] args) {

  ArrayList<String> list = new ArrayList<String>();

    list.add("One");
    list.add("Two");
    list.add("Three");
    list.add("Four");
    list.add("Five");

    System.out.println(list.size());

    for (int i = 0; i < list.size(); i++) {

      System.out.println(list.get(i));
    }
  }
}

