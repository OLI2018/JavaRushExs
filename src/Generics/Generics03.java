package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics03 {

  public static void main(String[] args) {

    List list = new ArrayList();
    list.add("SF");

    String str = list.get(0) + " Sacramento";

    String strNew = (String) list.get(0);
    System.out.println(strNew);
  }

}