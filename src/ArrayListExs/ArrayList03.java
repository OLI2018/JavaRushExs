package ArrayListExs;

import java.util.ArrayList;

public class ArrayList03 {

  public static void main(String[] args) {

    ArrayList<int[]> list = createList();
    printList(list);
  }

  public static ArrayList<int[]> createList() {

    ArrayList<int[]> arrayList = new ArrayList<>();

    int [] one = new int [5];
    int [] two = new int [2];
    int [] three = new int [4];
    int [] four = new int [7];
    int [] five = new int [0];


    arrayList.add(one);
    arrayList.add(two);
    arrayList.add(three);
    arrayList.add(four);
    arrayList.add(five);

    return arrayList;

  }

  public static void printList(ArrayList<int[]> list) {
    for (int[] array : list) {
      for (int x : array) {
        System.out.println(x);
      }
    }
  }
}

