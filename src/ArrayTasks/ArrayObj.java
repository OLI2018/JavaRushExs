package ArrayTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class  ArrayObj {

  private String name;

  public ArrayObj (String name) {
    this.name = name;
  }

  public static void main(String[] args) {

    ArrayObj [] arrayObjs = new ArrayObj[3];

    arrayObjs[0] = new ArrayObj("Tom");
    arrayObjs[1] = new ArrayObj("Goga");
    arrayObjs[2] = new ArrayObj("Lena");

    arrayObjs[1] = null;

    System.out.println(Arrays.toString(arrayObjs));

  }

  public String toString () {
  return "ArrayObj{" +
          "name='" + name + '\'' +
          '}';
  }
}
