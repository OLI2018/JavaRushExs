// Исправь четыре ошибки
// Version 02

import java.util.LinkedList;
import java.util.List;

public class CorrectFourErrors02 {

  public static void main(String[] args) {

    List<Number> list = new LinkedList<Number>();
    processCastedObjects(printListValues (initList(list)));
  }

  public static List<Number> initList(List<Number> list) {

    list.add(new Double(1000f));
    list.add(new Double("123e-445632"));
    list.add(new Float(-90 / -3));
    list.remove(new Double("123e-445632"));
    return list;

  }

  public static List<Number> printListValues(List<Number> list) {
    for (int i = 0; i <= list.size() - 1; i++) {
      System.out.println(list.get(i));
    }
      return list;
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

