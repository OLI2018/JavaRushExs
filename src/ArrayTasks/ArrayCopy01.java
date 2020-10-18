package ArrayTasks;

import java.util.Arrays;

public class ArrayCopy01 {

  public static void main(String[] args) {

    int [] list =  {123, 45, -45, 9876, 12, 45, 65, 73};

    int [] listCopy = Arrays.copyOf(list, list.length);

    System.out.println(Arrays.toString(listCopy));
  }
}
