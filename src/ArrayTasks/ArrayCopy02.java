package ArrayTasks;

import java.util.Arrays;

public class ArrayCopy02 {

  public static void main(String[] args) {

    int [] list =  {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

    int [] newArray = Arrays.copyOfRange(list,2,6);

    System.out.println(Arrays.toString(newArray));
  }
}
