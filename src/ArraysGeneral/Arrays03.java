package ArraysGeneral;

public class Arrays03 {

  public static void main(String[] args) {

    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {

      numbers[i] = i + 1;

    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);

    }
  }
}
