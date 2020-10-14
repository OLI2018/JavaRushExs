package ArrayListExs;

import java.util.ArrayList;

public class testtest {

  public static void main(String[] args) {

    ArrayList<String>[] list = new ArrayList[3];

    list[0].add(0, "1");
    list[1].add(1, "2");

    System.out.println(list);
  }
}
