package Collections;
import java.util.HashMap;
import java.util.Map;

public class MapPrintOutExm {

  public static void main(String[] args) {

    Map<String, String> map = new HashMap<String, String>();

    map.put("арбуз", "ягода");
    map.put("банан", "трава");
    map.put("вишня", "ягода");
    map.put("груша", "фрукт");
    map.put("дыня", "овощ");
    map.put("ежевика", "куст");
    map.put("жень-шень", "корень");
    map.put("земляника", "ягода");
    map.put("ирис", "цветок");
    map.put("картофель", "клубень");

     map.forEach((k, v) -> System.out.println(k + "-" + v));

//    for (Map.Entry<String, String> pair : map.entrySet())
//
//    {
//      String key = pair.getKey();
//      String value = pair.getValue();
//      System.out.println(key + " - " + value);
//    }
//  }

  }
}


