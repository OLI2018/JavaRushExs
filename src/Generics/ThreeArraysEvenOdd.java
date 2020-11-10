package Generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ThreeArraysEvenOdd {

  public static void main(String[] args) throws IOException {

    ArrayList<Integer> all = new ArrayList<Integer>();
    ArrayList<Integer> three = new ArrayList<Integer>();
    ArrayList<Integer> two = new ArrayList<Integer>();
    ArrayList<Integer> theRest = new ArrayList<Integer>();

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 20; i++) {
      String str = reader.readLine();
      int num = Integer.parseInt(str);
      all.add(num);
    }

    for (int i = 0; i < all.size(); i++) {
      Integer x = all.get(i);

      if (x % 3 == 0 || x % 3 == 0 && x % 2 == 0 )
        three.add(x);

      if (x % 2 == 0 || x % 3 == 0 && x % 2 == 0 )
        two.add(x);

      if (x % 3 != 0 &&  x % 2 != 0 )
      theRest.add(x);
    }

    printList (three);
    printList (two);
    printList (theRest);
  }

  public static void  printList (ArrayList<Integer> list) {

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));

    }
  }}

