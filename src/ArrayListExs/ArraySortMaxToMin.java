package ArrayListExs;

public class ArraySortMaxToMin {

  public static void main(String[] args) {

    int [] array = {19, 10, 16, 17, 9, 3, 4, 46, 97, 89, 12, 45, 98, 111, 42, 98, 98, -9, 71, -150};

    for (int i = 0; i < array.length; i++) {
      int max = array[i];
      int max_index = i;

      for (int j = i + 1; j < array.length; j++) {
        if (array[j] > max) {
          max = array[j];
          max_index = j;
        }
      }

        if (i != max_index)
        {
          int temp = array[i];
          array [i] = array[max_index];
          array[max_index] = temp;

        }
      }

    for (int j = 0; j < array.length; j++) {
      System.out.println(array[j]);

    }
  }
}
