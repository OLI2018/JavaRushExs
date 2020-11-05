package Exception;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class TryCatch08 {

  public static void main(String[] args) throws Exception {

    try {

      method1();
    }
    catch (NullPointerException e)
    {
      System.out.println(e);
    }
    catch (FileNotFoundException e)
    {
      System.out.println (e);
    }

  }

  public static void method1()  throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
    int i = (int) (Math.random() * 4);
    if (i == 0) {
      throw new NullPointerException(); //
    } else if (i == 1) {
      throw new ArithmeticException();
    } else if (i == 2) {
      throw new FileNotFoundException(); //
    } else if (i == 3) {
      throw new URISyntaxException("", "");
    }
  }
}

