package Generics;

import java.util.ArrayList;

public class MomWindowFrame {

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<String>();

    list.add("мама");
    list.add("мыла");
    list.add("раму");

    String imenno =  "именно";

    for (int i = 1; i < 7; i = i + 2) {

      list.add(i, imenno);

    }
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

  }
}
