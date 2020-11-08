package Exception;

public class TryCatchZero {

  public static void main(String[] args) {

    try
    {
    int a = 42 / 0;
      }
      catch (ArithmeticException e)
      {
        System.out.println(e);
      }
  }
}

