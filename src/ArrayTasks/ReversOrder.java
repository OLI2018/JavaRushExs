package ArrayTasks;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReversOrder {

  public static void main(String[] args) throws Exception{

    BufferedReader reader =  new BufferedReader(new InputStreamReader (System.in));

    String [] words = new String [10];

    for (int i = 0; i < words.length - 2; i++) {
    words [i] = reader.readLine();
    }

    for (int i = words.length - 1; i >=0; i --) {
      System.out.println(words[i]);
    }
  }
}
