package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatch04 {

  public static void main(String[] args) {

    printFirstString ("D:\\JavaRush_2020");

  }

    public static void printFirstString(String filePath) {

    try {

      BufferedReader reader = new BufferedReader(new FileReader(filePath));
      String firstString = reader.readLine();
      System.out.println(firstString);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("Ошибка, файл не найден!!!");
      e.printStackTrace();
    }
    catch (IOException e)
    {
      System.out.println("Ошибка при вводе/выводе данных из файла!");
      e.printStackTrace();
    }
    }
  }

