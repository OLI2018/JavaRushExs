package Exception;

public class TryCatch13 {

  public static void main(String[] args) {

    try
    {
      divideByZero();
    }

    catch (ArithmeticException e)
    {

      e.printStackTrace();
    }
  }

  public static void  divideByZero()
  {
    int random = (int) ((Math.random()) *100);
    int newRandon = random / 0;
    System.out.print(newRandon);
  }
}

