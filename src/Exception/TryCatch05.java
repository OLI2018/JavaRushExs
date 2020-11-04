package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatch05 {


  public static void main(String[] args) throws FileNotFoundException, IOException {

    printFirstString ("D:\\JavaRush_2020");

  }

  public static void printFirstString(String filePath) throws FileNotFoundException, IOException {

      BufferedReader reader = new BufferedReader(new FileReader(filePath));
      String firstString = reader.readLine();
      System.out.println(firstString);
    }
}
