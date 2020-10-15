package ArraysGeneral;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arrays06 {

  public static void main(String[] args) throws Exception{

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] list = new int[10];

    for (int i = 0; i < list.length; i++) {

      String s = reader.readLine();
      list[i] = Integer.parseInt(s);

    }
  }
}
