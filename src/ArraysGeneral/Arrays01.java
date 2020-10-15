package ArraysGeneral;

public class Arrays01 {

  public static void main(String[] args) {

    String[] list = new String[5];
    int length = list.length;

    System.out.println(length);

    list[1] = "Lion";
    list[2] = "Cat";
    list[3] = "Dog";

    System.out.println(list[1]);
    System.out.println(list[2]);
    System.out.println(list[3]);
  }
}
