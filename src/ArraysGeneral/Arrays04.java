package ArraysGeneral;

public class Arrays04 {

  public static void main(String[] args) {

    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {

      numbers[i] = 10 - i;

    }

    for (int i = 0; i < numbers.length; i++) {

      System.out.println(numbers[i]);

    }
  }
}
