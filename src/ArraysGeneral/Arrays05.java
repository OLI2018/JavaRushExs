package ArraysGeneral;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arrays05 {

  public static void main(String[] args) throws Exception{


    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] list = new String[10];

    for (int i = 0; i < list.length; i++) {

      list[i] = reader.readLine();

    }

  }

}
