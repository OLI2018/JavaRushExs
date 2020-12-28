package InitializationTasks;

// Статики-1
// Java Core,  5 уровень,  9 лекция

import java.util.HashMap;
import java.util.Map;

public class Initialization_01 {

  public static Map<Double, String> labels = new HashMap<Double, String>();

  static
  {
    labels.put (10.0, "A");
    labels.put (20.0, "B");
    labels.put (30.0, "C");
    labels.put (40.0, "D");
    labels.put (50.0, "E");

  }

  public static void main(String[] args) {
    System.out.println(labels);
  }
}


