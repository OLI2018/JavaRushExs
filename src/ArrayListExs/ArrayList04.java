package ArrayListExs;

import java.util.ArrayList;

public class ArrayList04 {

  public static void main(String[] args) {

    ArrayList<String>[] arrayOfStringList = createList();

    printList(arrayOfStringList);
  }

  public static ArrayList<String> [] createList() {

    ArrayList<String> list01 = new ArrayList<>();
    ArrayList<String> list02 = new ArrayList<>();
    ArrayList<String> list03 = new ArrayList<>();

    list01.add("one");
    list01.add("two");

    list02.add("three");
    list02.add("four");

    list03.add("five");
    list03.add("six");

    ArrayList<String> [] arrayStrings = new ArrayList[3];
    arrayStrings[0] = list01;
    arrayStrings[1] = list02;
    arrayStrings[2] = list03;


    return arrayStrings;
  }

  public static void printList(ArrayList<String>[] arrayOfStringList) {
    for (ArrayList<String> list : arrayOfStringList) {
      for (String string : list) {
        System.out.println(string);
      }
    }
  }
}



