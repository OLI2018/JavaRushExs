package ArraysGeneral;

public class Arrays07 {

  public static void main(String[] args) {

    int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

    int sum = 0;
    for (int i = 0; i < list.length; i++) {

      sum = sum + list[i];

      System.out.println("sum is " + sum);

    }
  }
}
