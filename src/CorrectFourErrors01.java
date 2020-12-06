// Исправь четыре ошибки
// Version 01

import java.util.LinkedList;
import java.util.List;

public class CorrectFourErrors01 {

  public static void main(String[] args) {

    initList();
  }

  public static void initList() {

    List<Number> list = new LinkedList<Number>();
    list.add(new Double(1000f));
    list.add(new Double("123e-445632"));
    list.add(new Float(-90 / -3));
    list.remove(new Double("123e-445632"));

    printListValues (list);
  }

  public static void printListValues(List<Number> list) {
    for (int i = 0; i <= list.size() - 1; i++) {
      System.out.println(list.get(i));
    }
    processCastedObjects (list);
  }

  public static void processCastedObjects(List<Number> list) {
    for (Number object : list) {
      if (object instanceof Float) {
        Float a = (Float) object;
        System.out.println("Is float value defined? " + !(a.isNaN()));
      } else if (object instanceof Double) {
        Double a = (Double) object;
        System.out.println("Is double value infinite? " + a.isInfinite());

      }
    }
  }
}





